package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.UsuarioDTO;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioDAO extends CrudRepository<UsuarioDTO, Integer> {
}
