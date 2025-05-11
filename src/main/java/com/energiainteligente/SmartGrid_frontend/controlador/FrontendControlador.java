package com.energiainteligente.SmartGrid_frontend.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontendControlador {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/validar-cliente")
    public String validarCliente() {
        return "validar-cliente";
    }

    @GetMapping("/validar-empleado")
    public String validarEmpleado() {
        return "validar-empleado";
    }
}
