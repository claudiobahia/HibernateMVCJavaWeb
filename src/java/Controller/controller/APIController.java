/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.controller;

import dao.UsuarioDAO;
import java.util.List;
import model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author claud
 */
@Controller
public class APIController {

    @RequestMapping(value = "/API/", method = RequestMethod.GET)
    public String api(Model model) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        List<Usuario> usuarios = usuarioDAO.getUsersList();
        model.addAttribute("usuarios", usuarios);
        return "api";
    }
}
