package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.UsuarioDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioDAO extends JpaRepository<UsuarioDTO, Long>, CrudRepository<UsuarioDTO, Long> {
    UsuarioDTO findByUsername(String username);
}
