package com.estudo.exerciciossb.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class PrimeiroController {

    @GetMapping(path = "/ola")
    public String ola() {
        return "Olá Spring Boot!";
    }

// Pode mapear duas URLs iguais porem com metodos diferentes
}
