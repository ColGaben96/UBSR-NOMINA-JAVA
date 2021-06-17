package co.edu.unbosque.model.service;

import co.edu.unbosque.model.persistence.EPSDTO;

import java.util.ArrayList;

public interface EPSService {
    ArrayList<EPSDTO> listAll();
    void save(EPSDTO sucursal);
    void delete(EPSDTO EPSDTO);
    EPSDTO findEPS(EPSDTO sucursal);
}
