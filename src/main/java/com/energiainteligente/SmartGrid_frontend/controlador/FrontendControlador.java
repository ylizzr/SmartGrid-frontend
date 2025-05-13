package com.energiainteligente.SmartGrid_frontend.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontendControlador {

    @GetMapping("/index")
    public String login() {
        return "index.html";
    }

}
