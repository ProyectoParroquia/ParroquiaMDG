package model;

import java.util.List;

import javax.persistence.*;

// Entidad
@Entity
// Relacion Con Tabla BD
@Table(name = "tipoDocumento")
public class TipoDocumento {

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoDocumento;

    @Column(name = "nombreTipoUsuario", length = 20)
    private String denominacionTipoDocumento;

    // Relacion 1 a N con Usuario
    @OneToMany(mappedBy = "TipoDocumento")
    private List<Usuario> Usuario;

    public TipoDocumento() {
    }

    public TipoDocumento(int idTipoDocumento, String denominacionTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
        this.denominacionTipoDocumento = denominacionTipoDocumento;
    }

    public int getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getDenominacionTipoDocumento() {
        return denominacionTipoDocumento;
    }

    public void setDenominacionTipoDocumento(String denominacionTipoDocumento) {
        this.denominacionTipoDocumento = denominacionTipoDocumento;
    }

}
