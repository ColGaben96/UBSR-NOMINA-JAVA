package co.edu.unbosque.model.implementation;

import co.edu.unbosque.model.ConceptoNominaDAO;
import co.edu.unbosque.model.persistence.ConceptoNominaDTO;
import co.edu.unbosque.model.service.ConceptoNominaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
public class ConceptoNominaImpl implements ConceptoNominaService {
    @Autowired
    private ConceptoNominaDAO ConceptoNomina;

    @Override
    @Transactional(readOnly = true)
    public ArrayList<ConceptoNominaDTO> listAll() {
        return (ArrayList<ConceptoNominaDTO>) this.ConceptoNomina.findAll();
    }

    @Override
    @Transactional
    public void save(ConceptoNominaDTO ConceptoNomina) {
        this.ConceptoNomina.save(ConceptoNomina);
    }

    @Override
    @Transactional
    public void delete(ConceptoNominaDTO ConceptoNomina) {
        this.ConceptoNomina.delete(ConceptoNomina);
    }

    @Override
    @Transactional(readOnly = true)
    public ConceptoNominaDTO findConceptoNomina(ConceptoNominaDTO ConceptoNomina) {
        return this.ConceptoNomina.findById(ConceptoNomina.getId()).orElse(null);
    }
}
