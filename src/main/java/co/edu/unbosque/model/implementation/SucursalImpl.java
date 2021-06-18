package co.edu.unbosque.model.implementation;

import co.edu.unbosque.model.SucursalDAO;
import co.edu.unbosque.model.persistence.SucursalDTO;
import co.edu.unbosque.model.service.SucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
public class SucursalImpl implements SucursalService {
    @Autowired
    private SucursalDAO Sucursal;

    @Override
    @Transactional(readOnly = true)
    public ArrayList<SucursalDTO> listAll() {
        return (ArrayList<SucursalDTO>) this.Sucursal.findAll();
    }

    @Override
    @Transactional
    public void save(SucursalDTO Sucursal) {
        this.Sucursal.save(Sucursal);
    }

    @Override
    @Transactional
    public void delete(SucursalDTO Sucursal) {
        this.Sucursal.delete(Sucursal);
    }

    @Override
    @Transactional(readOnly = true)
    public SucursalDTO findSucursal(SucursalDTO Sucursal) {
        return this.Sucursal.findById(Sucursal.getId()).orElse(null);
    }
}
