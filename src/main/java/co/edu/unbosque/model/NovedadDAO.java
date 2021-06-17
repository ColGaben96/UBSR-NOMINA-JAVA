package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.NovedadDTO;
import org.springframework.data.repository.CrudRepository;

public interface NovedadDAO extends CrudRepository<NovedadDTO, Long> {
}
