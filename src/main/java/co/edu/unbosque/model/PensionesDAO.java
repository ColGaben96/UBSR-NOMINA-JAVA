package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.PensionesDTO;
import org.springframework.data.repository.CrudRepository;

public interface PensionesDAO extends CrudRepository<PensionesDTO, Long> {
}
