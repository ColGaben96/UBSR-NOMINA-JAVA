package co.edu.unbosque.model.persistence;

import lombok.Data;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Entity
@Data
@Table(name = "conceptonomina")
public class ConceptoNominaDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 613202106L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombreConcepto;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id", nullable = false, updatable = false, insertable = false)
    private NovedadDTO novedad;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreConcepto() {
        return nombreConcepto;
    }

    public void setNombreConcepto(String nombreConcepto) {
        this.nombreConcepto = nombreConcepto;
    }

    public NovedadDTO getNovedad() {
        return novedad;
    }

    public void setNovedad(NovedadDTO novedad) {
        this.novedad = novedad;
    }
}
