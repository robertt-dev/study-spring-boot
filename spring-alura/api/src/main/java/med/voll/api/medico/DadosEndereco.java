package med.voll.api.medico;

import jakarta.persistence.Embeddable;

@Embeddable
public record DadosEndereco(
  String logradouro, 
  String bairro, 
  String cep, 
  String cidade, 
  String uf,
  String complemento, 
  String numero) {

} 
  

