package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.AccesoDTO;
import org.springframework.data.repository.CrudRepository;

public interface AccesoDAO extends CrudRepository<AccesoDTO, Long> {
}
