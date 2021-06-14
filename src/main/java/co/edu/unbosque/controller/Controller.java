package co.edu.unbosque.controller;

import co.edu.unbosque.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private UsuarioService usuario;

    @GetMapping("/")
    public String goIndex() {
        return "index";
    }
    @GetMapping("/Aplicacion/login")
    public String goLogin() { return "app/login"; }
    @GetMapping("/Aplicacion/")
    public String goDashboard() { return "app/dashboard"; }
    @GetMapping("/Aplicacion/signup")
    public String goSignup() { return "app/signup"; }
}
