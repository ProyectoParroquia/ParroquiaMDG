package model;

import java.util.List;

import javax.persistence.*;

// Entidad
@Entity
// Relacion Con Tabla BD
@Table(name = "TipoUsuario")
public class TipoUsuario {

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoUsuario;

    @Column(name = "nombreTipoUsuario", length = 20)
    private String nombreTipoUsuario;

    // Relacion 1 a N con Usuario
    @OneToMany(mappedBy = "TipoUsuario")
    private List<Usuario> Usuario;

    public TipoUsuario(int idTipoUsuario, String nombreTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
        this.nombreTipoUsuario = nombreTipoUsuario;
    }

    public TipoUsuario() {
    }

    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public String getNombreTipoUsuario() {
        return nombreTipoUsuario;
    }

    public void setNombreTipoUsuario(String nombreTipoUsuario) {
        this.nombreTipoUsuario = nombreTipoUsuario;
    }

}
