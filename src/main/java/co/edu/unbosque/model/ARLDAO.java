package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.ARLDTO;
import org.springframework.data.repository.CrudRepository;

public interface ARLDAO extends CrudRepository<ARLDTO, Long> {
}
