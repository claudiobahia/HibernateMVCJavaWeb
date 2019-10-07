/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.controller;

import dao.AlunoDAO;
import dao.CursoDAO;
import dao.ProfessorDAO;
import java.util.List;
import model.Aluno;
import model.Curso;
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
public class InController {

    @RequestMapping(value = "/changecurso", method = RequestMethod.GET)
    public String changecurso(Model model, @RequestParam("aluno_id") int aluno_id,
            @RequestParam("logado") boolean logado) {
        if (logado) {
            AlunoDAO alunoDAO = new AlunoDAO();
            List<Aluno> alunos = alunoDAO.getAlunoList();
            for (Aluno aluno : alunos) {
                if (aluno.getAluno_id() == aluno_id) {
                    model.addAttribute("aluno", aluno);
                }
            }
            return "updatecurso";
        } else {
            model.addAttribute("msg", "Você precisa logar primeiro para<br>acessar essa funcionalidade!");
            return "index";
        }
    }

    @RequestMapping(value = "/cursoatualizado", method = RequestMethod.POST)
    public String cursoatualizado(Model model, @RequestParam("aluno_id") int aluno_id,
            @RequestParam("curso") String cuString) {
        AlunoDAO alunoDAO = new AlunoDAO();
        String email = null;
        String senha = null;
        CursoDAO cursoDAO = new CursoDAO();
        Curso curso_id = new Curso();
        curso_id.setNome(cuString);
        cursoDAO.adicionar(curso_id);
        List<Aluno> alunos = alunoDAO.getAlunoList();
        for (Aluno aluno : alunos) {
            if (aluno.getAluno_id() == aluno_id) {
                aluno.setCurso_id(curso_id);
                email = aluno.getUsuario_id().getEmail();
                senha = aluno.getUsuario_id().getSenha();
                alunoDAO.update(aluno);
            }
        }
        LoginController controller = new LoginController();
        return controller.logar(model, email, senha);
    }

    @RequestMapping(value = "/listarprofessor", method = RequestMethod.GET)
    public String listar(Model model, @RequestParam("logado") boolean logado) {
        if (logado) {
            ProfessorDAO professorDAO = new ProfessorDAO();
            List<Professor> professors = professorDAO.getProfessorList();
            model.addAttribute("logado", logado);
            model.addAttribute("professors", professors);
            return "listarprofessor";
        } else {
            model.addAttribute("msg", "Você precisa logar primeiro para<br>acessar essa funcionalidade!");
            return "index";
        }
    }

    @RequestMapping(value = "/updateprofessor", method = RequestMethod.GET)
    public String updateprofessor(Model model, @RequestParam("professor_id") int professor_id,
            @RequestParam("logado") boolean logado) {
        if (logado) {
            ProfessorDAO professorDAO = new ProfessorDAO();
            List<Professor> professors = professorDAO.getProfessorList();
            for (Professor professor : professors) {
                if (professor.getProfessor_id() == professor_id) {
                    model.addAttribute("professor", professor);
                }
            }
            return "updateprofessor";
        } else {
            model.addAttribute("msg", "Você precisa logar primeiro para<br>acessar essa funcionalidade!");
            return "index";
        }
    }

    @RequestMapping(value = "/excluirprofessor", method = RequestMethod.GET)
    public String excluir(Model model, @RequestParam("professor_id") int professor_id,
            @RequestParam("logado") boolean logado) {
        if (logado) {
            ProfessorDAO professorDAO = new ProfessorDAO();
            for (Professor professor : professorDAO.getProfessorList()) {
                if (professor.getProfessor_id() == professor_id) {
                    professorDAO.excluir(professor);
                    model.addAttribute("msg", "Usuário excluido!");
                }
            }
            return listar(model, true);
        } else {
            model.addAttribute("msg", "Você precisa logar primeiro para<br>acessar essa funcionalidade!");
            return "index";
        }
    }

    @RequestMapping(value = "/atualizar", method = RequestMethod.POST)
    public String atualizar(Model model, @RequestParam("professor_id") int professor_id,
            @RequestParam("titulacao") String titulacao, @RequestParam("email") String email,
            @RequestParam("matricula") int matricula, @RequestParam("nome") String nome,
            @RequestParam("senha") String senha) {
        model.addAttribute("msg", "Usuário atualizado!");
        ProfessorDAO professorDAO = new ProfessorDAO();
        List<Professor> professors = professorDAO.getProfessorList();
        for (Professor professor : professors) {
            if (professor.getProfessor_id() == professor_id) {
                professor.setTitulacao(titulacao);
                professor.getUsuario_id().setEmail(email);
                professor.getUsuario_id().setMatricula(matricula);
                professor.getUsuario_id().setNome(nome);
                professor.getUsuario_id().setSenha(senha);
                professorDAO.update(professor);
            }
        }
        return listar(model, true);
    }

}
