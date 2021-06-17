package co.edu.unbosque.model.implementation;

import co.edu.unbosque.model.AccesoDAO;
import co.edu.unbosque.model.persistence.AccesoDTO;
import co.edu.unbosque.model.service.AccesoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
public class AccesoImpl implements AccesoService {
    @Autowired
    private AccesoDAO Acceso;

    @Override
    @Transactional(readOnly = true)
    public ArrayList<AccesoDTO> listAll() {
        return (ArrayList<AccesoDTO>) this.Acceso.findAll();
    }

    @Override
    @Transactional
    public void save(AccesoDTO Acceso) {
        this.Acceso.save(Acceso);
    }

    @Override
    @Transactional
    public void delete(AccesoDTO Acceso) {
        this.Acceso.delete(Acceso);
    }

    @Override
    @Transactional(readOnly = true)
    public AccesoDTO findAcceso(AccesoDTO Acceso) {
        return this.Acceso.findById(Acceso.getId()).orElse(null);
    }
}
