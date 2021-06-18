package co.edu.unbosque.model.implementation;

import co.edu.unbosque.model.ARLDAO;
import co.edu.unbosque.model.persistence.ARLDTO;
import co.edu.unbosque.model.service.ARLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
public class ARLImpl implements ARLService {
    @Autowired
    private ARLDAO ARL;

    @Override
    @Transactional(readOnly = true)
    public ArrayList<ARLDTO> listAll() {
        return (ArrayList<ARLDTO>) this.ARL.findAll();
    }

    @Override
    @Transactional
    public void save(ARLDTO ARL) {
        this.ARL.save(ARL);
    }

    @Override
    @Transactional
    public void delete(ARLDTO ARL) {
        this.ARL.delete(ARL);
    }

    @Override
    @Transactional(readOnly = true)
    public ARLDTO findARL(ARLDTO ARL) {
        return this.ARL.findById(ARL.getIdArl()).orElse(null);
    }
}
