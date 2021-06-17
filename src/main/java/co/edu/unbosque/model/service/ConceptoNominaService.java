package co.edu.unbosque.model.service;

import co.edu.unbosque.model.persistence.ConceptoNominaDTO;

import java.util.ArrayList;

public interface ConceptoNominaService {
    ArrayList<ConceptoNominaDTO> listAll();
    void save(ConceptoNominaDTO sucursal);
    void delete(ConceptoNominaDTO ConceptoNominaDTO);
    ConceptoNominaDTO findConceptoNomina(ConceptoNominaDTO sucursal);
}
