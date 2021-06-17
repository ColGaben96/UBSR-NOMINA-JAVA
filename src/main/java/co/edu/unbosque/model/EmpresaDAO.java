package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.EmpresaDTO;
import org.springframework.data.repository.CrudRepository;

public interface EmpresaDAO extends CrudRepository<EmpresaDTO, Long> {
}
