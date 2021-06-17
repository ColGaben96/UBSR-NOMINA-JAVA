package co.edu.unbosque.model.persistence;

import lombok.Data;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Entity
@Data
@Table(name = "eps")
public class EPSDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 613202107L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEps;
    private String nombre;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id", nullable = false, updatable = false, insertable = false)
    private EmpleadoDTO empleado_FK;

    public long getIdEps() {
        return idEps;
    }

    public void setIdEps(long idEps) {
        this.idEps = idEps;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public EmpleadoDTO getEmpleado_FK() {
        return empleado_FK;
    }

    public void setEmpleado_FK(EmpleadoDTO empleado_FK) {
        this.empleado_FK = empleado_FK;
    }
}
