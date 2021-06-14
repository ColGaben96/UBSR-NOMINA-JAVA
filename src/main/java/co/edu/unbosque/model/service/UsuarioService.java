package co.edu.unbosque.model.service;

import co.edu.unbosque.model.persistence.UsuarioDTO;

import java.util.ArrayList;

public interface UsuarioService {
    ArrayList<UsuarioDTO> listAll();
    void save(UsuarioDTO usuario);
    void delete(UsuarioDTO usuario);
    UsuarioDTO findUsuario(UsuarioDTO usuario);
}
