package co.edu.unbosque.model.implementation;

import co.edu.unbosque.model.EmpresaDAO;
import co.edu.unbosque.model.persistence.EmpresaDTO;
import co.edu.unbosque.model.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
public class EmpresaImpl implements EmpresaService {
    @Autowired
    private EmpresaDAO Empresa;

    @Override
    @Transactional(readOnly = true)
    public ArrayList<EmpresaDTO> listAll() {
        return (ArrayList<EmpresaDTO>) this.Empresa.findAll();
    }

    @Override
    @Transactional
    public void save(EmpresaDTO Empresa) {
        this.Empresa.save(Empresa);
    }

    @Override
    @Transactional
    public void delete(EmpresaDTO Empresa) {
        this.Empresa.delete(Empresa);
    }

    @Override
    @Transactional(readOnly = true)
    public EmpresaDTO findEmpresa(EmpresaDTO Empresa) {
        return this.Empresa.findById(Empresa.getId()).orElse(null);
    }
}
