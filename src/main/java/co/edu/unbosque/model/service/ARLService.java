package co.edu.unbosque.model.service;

import co.edu.unbosque.model.persistence.ARLDTO;

import java.util.ArrayList;

public interface ARLService {
    ArrayList<ARLDTO> listAll();
    void save(ARLDTO sucursal);
    void delete(ARLDTO ARLDTO);
    ARLDTO findARL(ARLDTO sucursal);
}
