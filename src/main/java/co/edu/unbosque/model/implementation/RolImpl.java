package co.edu.unbosque.model.implementation;

import co.edu.unbosque.model.RolDAO;
import co.edu.unbosque.model.persistence.RolDTO;
import co.edu.unbosque.model.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
public class RolImpl implements RolService {
    @Autowired
    private RolDAO Rol;

    @Override
    @Transactional(readOnly = true)
    public ArrayList<RolDTO> listAll() {
        return (ArrayList<RolDTO>) this.Rol.findAll();
    }

    @Override
    @Transactional
    public void save(RolDTO Rol) {
        this.Rol.save(Rol);
    }

    @Override
    @Transactional
    public void delete(RolDTO Rol) {
        this.Rol.delete(Rol);
    }

    @Override
    @Transactional(readOnly = true)
    public RolDTO findRol(RolDTO Rol) {
        return this.Rol.findById(Rol.getId()).orElse(null);
    }
}
