package com.estudo.exerciciossb.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping(path = ("/caucular"))
public class CalculadoraController {

    @RequestMapping(path = ("/somar"))
    public int somar(@PathParam("a") int a, @PathParam("b") int b) {
        return a + b;
    }

    // @RequestMapping(path = ("/10/20"))
    // public int somar(@PathVariable int a, @PathVariable int b) {
    // return a + b;
    // }

}
// /10/10
// ?a=10&b=10