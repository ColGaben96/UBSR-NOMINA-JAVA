package co.edu.unbosque.model.service;

import co.edu.unbosque.model.persistence.DepartamentoDTO;

import java.util.ArrayList;

public interface DepartamentoService {
    ArrayList<DepartamentoDTO> listAll();
    void save(DepartamentoDTO sucursal);
    void delete(DepartamentoDTO DepartamentoDTO);
    DepartamentoDTO findDepartamento(DepartamentoDTO sucursal);
}
