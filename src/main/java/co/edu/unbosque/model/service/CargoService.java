package co.edu.unbosque.model.service;

import co.edu.unbosque.model.persistence.CargoDTO;

import java.util.ArrayList;

public interface CargoService {
    ArrayList<CargoDTO> listAll();
    void save(CargoDTO sucursal);
    void delete(CargoDTO CargoDTO);
    CargoDTO findCargo(CargoDTO sucursal);
}
