package co.edu.unbosque.model.implementation;

import co.edu.unbosque.model.UsuarioDAO;
import co.edu.unbosque.model.persistence.UsuarioDTO;
import co.edu.unbosque.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
public class UsuarioImpl implements UsuarioService {
    @Autowired
    private UsuarioDAO usuario;

    @Override
    @Transactional(readOnly = true)
    public ArrayList<UsuarioDTO> listAll() {
        return (ArrayList<UsuarioDTO>) this.usuario.findAll();
    }

    @Override
    @Transactional
    public void save(UsuarioDTO usuario) {
        this.usuario.save(usuario);
    }

    @Override
    @Transactional
    public void delete(UsuarioDTO usuario) {
        this.usuario.delete(usuario);
    }

    @Override
    @Transactional(readOnly = true)
    public UsuarioDTO findUsuario(UsuarioDTO usuario) {
        return this.usuario.findById(usuario.getId()).orElse(null);
    }
}
