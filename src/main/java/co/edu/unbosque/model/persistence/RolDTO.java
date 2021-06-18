package co.edu.unbosque.model.persistence;

import lombok.Data;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Entity
@Data
@Table(name = "rol")
public class RolDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 613202100L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idRol;
    private String nombre;

    public long getIdRol() {
        return idRol;
    }

    public void setIdRol(long id) {
        this.idRol = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
