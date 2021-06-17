package co.edu.unbosque.model.persistence;


import lombok.Data;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@Table(name = "novedad")
public class NovedadDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 613202109L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int numDias;
    private Date fechaInicio;
    private Date fechaFin;
    private double valor;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id", nullable = false, updatable = false, insertable = false)
    private EmpleadoDTO empleado_FK;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumDias() {
        return numDias;
    }

    public void setNumDias(int numDias) {
        this.numDias = numDias;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public EmpleadoDTO getEmpleado_FK() {
        return empleado_FK;
    }

    public void setEmpleado_FK(EmpleadoDTO empleado_FK) {
        this.empleado_FK = empleado_FK;
    }
}
