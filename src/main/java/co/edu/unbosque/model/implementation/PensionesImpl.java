package co.edu.unbosque.model.implementation;

import co.edu.unbosque.model.PensionesDAO;
import co.edu.unbosque.model.persistence.PensionesDTO;
import co.edu.unbosque.model.service.PensionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
public class PensionesImpl implements PensionesService {
    @Autowired
    private PensionesDAO Pensiones;

    @Override
    @Transactional(readOnly = true)
    public ArrayList<PensionesDTO> listAll() {
        return (ArrayList<PensionesDTO>) this.Pensiones.findAll();
    }

    @Override
    @Transactional
    public void save(PensionesDTO Pensiones) {
        this.Pensiones.save(Pensiones);
    }

    @Override
    @Transactional
    public void delete(PensionesDTO Pensiones) {
        this.Pensiones.delete(Pensiones);
    }

    @Override
    @Transactional(readOnly = true)
    public PensionesDTO findPensiones(PensionesDTO Pensiones) {
        return this.Pensiones.findById(Pensiones.getIdPension()).orElse(null);
    }
}
