package co.edu.unbosque.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    public String goIndex() {
        return "index";
    }
}
