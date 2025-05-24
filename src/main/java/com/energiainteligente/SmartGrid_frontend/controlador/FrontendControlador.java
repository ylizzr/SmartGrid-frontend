package com.energiainteligente.SmartGrid_frontend.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FrontendControlador {

    @GetMapping("/index")
    public String login() {
        return "index.html";
    }

    @GetMapping("/portal-clientes")
    public String clientes() {
        return "portal-clientes";
    }

    @GetMapping("/portal-operadores")
    public String operadores() {
        return "portal-operadores";
    }

    @GetMapping("/pago")
    public String mostrarFormularioPago() {
        return "pago-form";
    }

    @PostMapping("/pago")
    public String procesarPago(@RequestParam("cuenta") String cuenta, Model model) {
        model.addAttribute("mensaje", "Pago procesado para la cuenta: " + cuenta);
        return "pago-confirmado";
    }
}
