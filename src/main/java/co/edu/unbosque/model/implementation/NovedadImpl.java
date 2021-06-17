package co.edu.unbosque.model.implementation;

import co.edu.unbosque.model.NovedadDAO;
import co.edu.unbosque.model.persistence.NovedadDTO;
import co.edu.unbosque.model.service.NovedadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
public class NovedadImpl implements NovedadService {
    @Autowired
    private NovedadDAO Novedad;

    @Override
    @Transactional(readOnly = true)
    public ArrayList<NovedadDTO> listAll() {
        return (ArrayList<NovedadDTO>) this.Novedad.findAll();
    }

    @Override
    @Transactional
    public void save(NovedadDTO Novedad) {
        this.Novedad.save(Novedad);
    }

    @Override
    @Transactional
    public void delete(NovedadDTO Novedad) {
        this.Novedad.delete(Novedad);
    }

    @Override
    @Transactional(readOnly = true)
    public NovedadDTO findNovedad(NovedadDTO Novedad) {
        return this.Novedad.findById(Novedad.getId()).orElse(null);
    }
}
