package co.edu.unbosque.model.service;

import co.edu.unbosque.model.persistence.AccesoDTO;

import java.util.ArrayList;

public interface AccesoService {
    ArrayList<AccesoDTO> listAll();
    void save(AccesoDTO sucursal);
    void delete(AccesoDTO AccesoDTO);
    AccesoDTO findAcceso(AccesoDTO sucursal);
}
