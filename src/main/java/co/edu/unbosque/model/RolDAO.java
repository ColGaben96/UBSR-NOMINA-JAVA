package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.RolDTO;
import org.springframework.data.repository.CrudRepository;

public interface RolDAO extends CrudRepository<RolDTO, Long> {
}
