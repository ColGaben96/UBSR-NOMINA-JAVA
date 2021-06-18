package co.edu.unbosque.model.service;

import co.edu.unbosque.model.persistence.SucursalDTO;

import java.util.ArrayList;

public interface SucursalService {
    ArrayList<SucursalDTO> listAll();
    void save(SucursalDTO sucursal);
    void delete(SucursalDTO sucursalDTO);
    SucursalDTO findSucursal(SucursalDTO sucursal);
}
