package co.edu.unbosque.model.service;

import co.edu.unbosque.model.persistence.NovedadDTO;

import java.util.ArrayList;

public interface NovedadService {
    ArrayList<NovedadDTO> listAll();
    void save(NovedadDTO sucursal);
    void delete(NovedadDTO NovedadDTO);
    NovedadDTO findNovedad(NovedadDTO sucursal);
}
