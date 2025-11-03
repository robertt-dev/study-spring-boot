package med.voll.api.medico;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
  
    // <> tipo da entidade e o tipo da chave primaria
}
