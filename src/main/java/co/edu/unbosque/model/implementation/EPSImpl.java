package co.edu.unbosque.model.implementation;

import co.edu.unbosque.model.EPSDAO;
import co.edu.unbosque.model.persistence.EPSDTO;
import co.edu.unbosque.model.service.EPSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
public class EPSImpl implements EPSService {
    @Autowired
    private EPSDAO EPS;

    @Override
    @Transactional(readOnly = true)
    public ArrayList<EPSDTO> listAll() {
        return (ArrayList<EPSDTO>) this.EPS.findAll();
    }

    @Override
    @Transactional
    public void save(EPSDTO EPS) {
        this.EPS.save(EPS);
    }

    @Override
    @Transactional
    public void delete(EPSDTO EPS) {
        this.EPS.delete(EPS);
    }

    @Override
    @Transactional(readOnly = true)
    public EPSDTO findEPS(EPSDTO EPS) {
        return this.EPS.findById(EPS.getIdEps()).orElse(null);
    }
}
