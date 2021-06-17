package co.edu.unbosque.model.service;

import co.edu.unbosque.model.persistence.PensionesDTO;

import java.util.ArrayList;

public interface PensionesService {
    ArrayList<PensionesDTO> listAll();
    void save(PensionesDTO sucursal);
    void delete(PensionesDTO PensionesDTO);
    PensionesDTO findPensiones(PensionesDTO sucursal);
}
