package model;

import javax.persistence.*;

// Entidad
@Entity
// Relacion Con Tabla BD
@Table(name = "AnuncioUsuario")
public class AnuncioUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAnuncioUsuario;

    @Column(name = "idAnuncioFK")
    private int idAnuncioFK;

    @Column(name = "idUsuarioAFK")
    private int idUsuarioAFK;

    @Column(name = "fechaPublicaion", length = 10)
    private String fechaPublicaion;

    // Relacion N a 1 con Usuario
    @ManyToOne
    @JoinColumn(name = "idUsuarioAFK", insertable = false, updatable = false)
    private Usuario Usuario;

    // Relacion N a 1 con Anuncio
    @ManyToOne
    @JoinColumn(name = "idAnuncioFK", insertable = false, updatable = false)
    private Anuncio Anuncio;

    public AnuncioUsuario() {
    }

    public AnuncioUsuario(int idAnuncioUsuario, int idAnuncioFK, int idUsuarioAFK, String fechaPublicaion) {
        this.idAnuncioUsuario = idAnuncioUsuario;
        this.idAnuncioFK = idAnuncioFK;
        this.idUsuarioAFK = idUsuarioAFK;
        this.fechaPublicaion = fechaPublicaion;
    }

    public int getIdAnuncioUsuario() {
        return idAnuncioUsuario;
    }

    public void setIdAnuncioUsuario(int idAnuncioUsuario) {
        this.idAnuncioUsuario = idAnuncioUsuario;
    }

    public int getIdAnuncioFK() {
        return idAnuncioFK;
    }

    public void setIdAnuncioFK(int idAnuncioFK) {
        this.idAnuncioFK = idAnuncioFK;
    }

    public int getIdUsuarioAFK() {
        return idUsuarioAFK;
    }

    public void setIdUsuarioAFK(int idUsuarioAFK) {
        this.idUsuarioAFK = idUsuarioAFK;
    }

    public String getFechaPublicaion() {
        return fechaPublicaion;
    }

    public void setFechaPublicaion(String fechaPublicaion) {
        this.fechaPublicaion = fechaPublicaion;
    }

}
