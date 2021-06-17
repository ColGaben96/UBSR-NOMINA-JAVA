package co.edu.unbosque.model.persistence;

import lombok.Data;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Entity
@Data
@Table(name = "arl")
public class ARLDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 613202106L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idArl;
    private String nombre;
    private String riesgo;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id", nullable = false, updatable = false, insertable = false)
    private EmpleadoDTO empleado_FK;

    public long getIdArl() {
        return idArl;
    }

    public void setIdArl(long idArl) {
        this.idArl = idArl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRiesgo() {
        return riesgo;
    }

    public void setRiesgo(String riesgo) {
        this.riesgo = riesgo;
    }

    public EmpleadoDTO getEmpleado_FK() {
        return empleado_FK;
    }

    public void setEmpleado_FK(EmpleadoDTO empleado_FK) {
        this.empleado_FK = empleado_FK;
    }
}
