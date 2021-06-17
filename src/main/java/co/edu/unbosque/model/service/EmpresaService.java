package co.edu.unbosque.model.service;

import co.edu.unbosque.model.persistence.EmpresaDTO;

import java.util.ArrayList;

public interface EmpresaService {
    ArrayList<EmpresaDTO> listAll();
    void save(EmpresaDTO sucursal);
    void delete(EmpresaDTO EmpresaDTO);
    EmpresaDTO findEmpresa(EmpresaDTO sucursal);
}
