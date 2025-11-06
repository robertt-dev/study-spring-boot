package med.voll.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import med.voll.api.paciente.DadosCadastroPaciente;
import med.voll.api.paciente.DadosListagemPaciente;
import med.voll.api.paciente.Paciente;
import med.voll.api.paciente.PacienteRepository;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

  @Autowired
  private PacienteRepository PacienteRepository;
  
  @PostMapping
  @Transactional
  public void cadastroPaciente(@RequestBody @Valid DadosCadastroPaciente dados) {
      PacienteRepository.save(new Paciente(dados));
  }

  @GetMapping
  public Page<DadosListagemPaciente> listar(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao) {
      return PacienteRepository.findAllByAtivoTrue(paginacao).map(DadosListagemPaciente::new);
  }

  @DeleteMapping("/{id}")
  @Transactional
  public void excluirPaciente(@PathVariable Long id) {
    var paciente = PacienteRepository.getReferenceById(id);

    paciente.excluirPaciente();
  }
}
