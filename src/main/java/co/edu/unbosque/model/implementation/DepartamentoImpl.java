package co.edu.unbosque.model.implementation;

import co.edu.unbosque.model.DepartamentoDAO;
import co.edu.unbosque.model.persistence.DepartamentoDTO;
import co.edu.unbosque.model.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
public class DepartamentoImpl implements DepartamentoService {
    @Autowired
    private DepartamentoDAO Departamento;

    @Override
    @Transactional(readOnly = true)
    public ArrayList<DepartamentoDTO> listAll() {
        return (ArrayList<DepartamentoDTO>) this.Departamento.findAll();
    }

    @Override
    @Transactional
    public void save(DepartamentoDTO Departamento) {
        this.Departamento.save(Departamento);
    }

    @Override
    @Transactional
    public void delete(DepartamentoDTO Departamento) {
        this.Departamento.delete(Departamento);
    }

    @Override
    @Transactional(readOnly = true)
    public DepartamentoDTO findDepartamento(DepartamentoDTO Departamento) {
        return this.Departamento.findById(Departamento.getId()).orElse(null);
    }
}
