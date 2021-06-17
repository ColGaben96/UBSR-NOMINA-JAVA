package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.EPSDTO;
import org.springframework.data.repository.CrudRepository;

public interface EPSDAO extends CrudRepository<EPSDTO, Long> {
}
