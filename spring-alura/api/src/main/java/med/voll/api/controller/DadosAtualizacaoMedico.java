package med.voll.api.controller;

import jakarta.validation.constraints.NotNull;
import med.voll.api.medico.DadosEndereco;

public record DadosAtualizacaoMedico(

    @NotNull
    Long id, 

    String nome, 
    String telefone,
    DadosEndereco endereco) {

    
} 

