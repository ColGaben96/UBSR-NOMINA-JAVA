package co.edu.unbosque.model.persistence;

import lombok.Data;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;


@Entity
@Data
@Table(name = "departamento")
public class DepartamentoDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 613202111L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id", nullable = false, updatable = false, insertable = false)
    private CargoDTO cargo_FK;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CargoDTO getCargo_FK() {
        return cargo_FK;
    }

    public void setCargo_FK(CargoDTO cargo_FK) {
        this.cargo_FK = cargo_FK;
    }
}
