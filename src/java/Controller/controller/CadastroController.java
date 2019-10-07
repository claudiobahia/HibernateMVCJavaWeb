/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.controller;

import dao.AlunoDAO;
import dao.ProfessorDAO;
import dao.UsuarioDAO;
import model.Aluno;
import model.Curso;
import model.Perfil;
import model.Professor;
import model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author claud
 */
@Controller
public class CadastroController {

    @RequestMapping(value = {"/", "", "index"}, method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/cadastro", method = RequestMethod.GET)
    public String cadastro() {
        return "cadastro";
    }

    @RequestMapping(value = "/cadastroEfetuado", method = RequestMethod.POST)
    public String cadastrar(Model model, @RequestParam("perfil_id") String perfil_nome,
            @RequestParam("nome") String nome, @RequestParam("email") String email,
            @RequestParam("senha") String senha, @RequestParam("matricula") String matricula,
            @RequestParam("titulacao") String titulacao, @RequestParam("datanasc") String datanasc) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        AlunoDAO alunoDAO = new AlunoDAO();
        ProfessorDAO professorDAO = new ProfessorDAO();

        Perfil perfil = new Perfil();
        perfil.setNome(perfil_nome);
        if (perfil_nome.equals("Aluno")) {
            perfil.setPerfil_id(1);
        } else {
            perfil.setPerfil_id(2);
        }

        Usuario usuario = new Usuario();

        usuario.setPerfil_id(perfil); //get perfil datas
        usuario.setMatricula(Integer.parseInt(matricula));
        usuario.setNome(nome);
        usuario.setEmail(email);
        usuario.setSenha(senha);
        usuarioDAO.adicionar(usuario); //add usuario db

        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        if (usuario.getPerfil_id().getNome().equals("Aluno")) {
            aluno.setUsuario_id(usuario);
            Curso curso = new Curso();
            curso.setNome("default");
            aluno.setCurso_id(curso);
            aluno.setDatanasc(datanasc);

            alunoDAO.adicionar(aluno);
        } else {
            professor.setUsuario_id(usuario);
            professor.setTitulacao(titulacao);

            professorDAO.adicionar(professor);
        }

        model.addAttribute("msg", usuario.getNome() + ";<br>" + perfil_nome
                + "; <br>Cadastrado!");

        return "index";
    }
}
