package com.example.api_rest_basic_auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hello")
public class HelloController {



    @GetMapping("/public")
    public String publicApi() {
        return "Esta ruta es pública";
    }

    @GetMapping("/private")
    public String privateApi() {
        return "Ruta privada: ¡Autenticación exitosa!";
    }
}
