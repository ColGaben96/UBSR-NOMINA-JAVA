package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.SucursalDTO;
import org.springframework.data.repository.CrudRepository;

public interface SucursalDAO extends CrudRepository<SucursalDTO, Long> {
}
