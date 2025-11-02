package med.voll.api.medico;

public record DadosCadastroMedico(
  String nome, 
  String email, 
  String telefone, 
  String crm, 
  Especialidade especialidade,
  DadosEndereco endereco) {
} 
  
