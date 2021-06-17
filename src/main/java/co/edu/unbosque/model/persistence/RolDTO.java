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
    private long id;
    private String nombre;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id", nullable = false, updatable = false, insertable = false)
    private UsuarioDTO usuario_FK;

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

    public UsuarioDTO getUsuario_FK() {
        return usuario_FK;
    }

    public void setUsuario_FK(UsuarioDTO usuario_FK) {
        this.usuario_FK = usuario_FK;
    }
}
