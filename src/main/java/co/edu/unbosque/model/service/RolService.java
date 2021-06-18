package co.edu.unbosque.model.service;

import co.edu.unbosque.model.persistence.RolDTO;

import java.util.ArrayList;

public interface RolService {
    ArrayList<RolDTO> listAll();
    void save(RolDTO sucursal);
    void delete(RolDTO RolDTO);
    RolDTO findRol(RolDTO sucursal);
}
