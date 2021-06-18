package co.edu.unbosque.model.implementation;

import co.edu.unbosque.model.CargoDAO;
import co.edu.unbosque.model.persistence.CargoDTO;
import co.edu.unbosque.model.service.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
public class CargoImpl implements CargoService {
    @Autowired
    private CargoDAO Cargo;

    @Override
    @Transactional(readOnly = true)
    public ArrayList<CargoDTO> listAll() {
        return (ArrayList<CargoDTO>) this.Cargo.findAll();
    }

    @Override
    @Transactional
    public void save(CargoDTO Cargo) {
        this.Cargo.save(Cargo);
    }

    @Override
    @Transactional
    public void delete(CargoDTO Cargo) {
        this.Cargo.delete(Cargo);
    }

    @Override
    @Transactional(readOnly = true)
    public CargoDTO findCargo(CargoDTO Cargo) {
        return this.Cargo.findById(Cargo.getId()).orElse(null);
    }
}
