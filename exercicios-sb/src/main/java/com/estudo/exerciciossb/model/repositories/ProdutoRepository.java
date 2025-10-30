package com.estudo.exerciciossb.model.repositories;

import org.springframework.data.repository.CrudRepository;

import com.estudo.exerciciossb.model.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

    
} 
