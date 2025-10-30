package com.estudo.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.estudo.exerciciossb.model.entities.Cliente;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

    @GetMapping(path = "/qualquer")
    public Cliente obterCliente() {
        return new Cliente(1, "Pedro", "123.456.789-98");
    }

    @GetMapping("/{id}") // Dentro de {} pois é uma variavel
    public Cliente obterClientePorId(@PathVariable int id) {
        return new Cliente(id, "Maria", "345.657.445-55");
    }

    @GetMapping
    public Cliente obterClientePorId2(
        @RequestParam(name = "id", defaultValue = "1") int id) {
        return new Cliente(id, "Algusto", "985.665.445-55");
    }
}
