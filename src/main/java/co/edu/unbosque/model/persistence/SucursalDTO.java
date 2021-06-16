package co.edu.unbosque.model.persistence;

import lombok.Data;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Entity
@Data
@Table(name = "sucursal")
public class SucursalDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 613202103L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String direccion;
    private long telefono;

}
