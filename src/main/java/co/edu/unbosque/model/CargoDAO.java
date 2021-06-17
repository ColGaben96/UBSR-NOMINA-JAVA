package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.CargoDTO;
import org.springframework.data.repository.CrudRepository;

public interface CargoDAO extends CrudRepository<CargoDTO, Long> {
}
