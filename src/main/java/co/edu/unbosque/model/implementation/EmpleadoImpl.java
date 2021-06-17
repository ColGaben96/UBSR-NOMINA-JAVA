package co.edu.unbosque.model.implementation;

import co.edu.unbosque.model.EmpleadoDAO;
import co.edu.unbosque.model.persistence.EmpleadoDTO;
import co.edu.unbosque.model.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
public class EmpleadoImpl implements EmpleadoService {
    @Autowired
    private EmpleadoDAO Empleado;

    @Override
    @Transactional(readOnly = true)
    public ArrayList<EmpleadoDTO> listAll() {
        return (ArrayList<EmpleadoDTO>) this.Empleado.findAll();
    }

    @Override
    @Transactional
    public void save(EmpleadoDTO Empleado) {
        this.Empleado.save(Empleado);
    }

    @Override
    @Transactional
    public void delete(EmpleadoDTO Empleado) {
        this.Empleado.delete(Empleado);
    }

    @Override
    @Transactional(readOnly = true)
    public EmpleadoDTO findEmpleado(EmpleadoDTO Empleado) {
        return this.Empleado.findById(Empleado.getId()).orElse(null);
    }
}
