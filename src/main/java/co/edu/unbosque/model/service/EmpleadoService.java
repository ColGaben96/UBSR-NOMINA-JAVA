package co.edu.unbosque.model.service;

import co.edu.unbosque.model.persistence.EmpleadoDTO;

import java.util.ArrayList;

public interface EmpleadoService {
    ArrayList<EmpleadoDTO> listAll();
    void save(EmpleadoDTO sucursal);
    void delete(EmpleadoDTO EmpleadoDTO);
    EmpleadoDTO findEmpleado(EmpleadoDTO sucursal);
}
