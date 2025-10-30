package com.estudo.exerciciossb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.estudo.exerciciossb.model.entities.Produto;
import com.estudo.exerciciossb.model.repositories.ProdutoRepository;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;
    
    @PostMapping
    @RequestMapping(path = ("/api/produtos"))
    public Produto novoProduto(@RequestParam String nome) {
        Produto produto = new Produto(nome);
        produtoRepository.save(produto);
        return produto;
    }
}
