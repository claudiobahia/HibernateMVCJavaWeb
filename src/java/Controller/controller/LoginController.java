/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.controller;

import dao.AlunoDAO;
import dao.PerfilDAO;
import dao.ProfessorDAO;
import dao.UsuarioDAO;
import java.util.List;
import model.Aluno;
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
public class LoginController {

    @RequestMapping(value = "/logar", method = RequestMethod.GET)
    public String logar(Model model, @RequestParam("email") String email,
            @RequestParam("senha") String senha) {
        boolean logado = false;
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        List<Usuario> usuarios = usuarioDAO.getUsersList();
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equals(email)) {
                if (usuario.getSenha().equals(senha)) {
                    logado = true;
                    model.addAttribute("logado", logado);
                    model.addAttribute("usuario", usuario);
                    if (usuario.getPerfil_id().getNome().equals("Aluno")) {
                        AlunoDAO alunoDAO = new AlunoDAO();
                        List<Aluno> alunos = alunoDAO.getAlunoList();
                        for (Aluno aluno : alunos) {
                            if (aluno.getUsuario_id().getUsuario_id() == usuario.getUsuario_id()) {
                                model.addAttribute("aluno", aluno);
                                break;
                            }
                        }
                        return "aluno";
                    } else {
                        ProfessorDAO professorDAO = new ProfessorDAO();
                        List<Professor> professors = professorDAO.getProfessorList();
                        for (Professor professor : professors) {
                            if (professor.getUsuario_id().getUsuario_id() == usuario.getUsuario_id()) {
                                model.addAttribute("professor", professor);
                                break;
                            }
                        }
                        return "professor";
                    }
                } else {
                    logado = false;
                }
            } else {
                logado = false;
            }
        }
        model.addAttribute("msg", "Email ou senha inválidos!!");
        return "index";
    }
    
//    @RequestMapping(value = "/auth", method = RequestMethod.GET)
//    public String autenticador(Model model, @RequestParam("usuario") Usuario usuario,){
//        
//    }
    
//    public String outrorquest()
//{
//  return "redirect:/nomeRequestmapp.do";
//}

}
