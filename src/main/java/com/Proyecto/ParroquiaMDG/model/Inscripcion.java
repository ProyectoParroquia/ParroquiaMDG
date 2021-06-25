package com.Proyecto.ParroquiaMDG.model;

import java.util.List;

import javax.persistence.*;

// Entidad
@Entity
// Relacion Con Tabla BD
@Table(name = "Inscripcion")
public class Inscripcion {
    // Atributos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idInscripcion;

    @Column(name = "estadoInscripcion", length = 10)
    private String estadoInscripcion;

    @Column(name = "plazoInscripcion", length = 20)
    private String plazoInscripcion;

    @Column(name = "idUsuarioIFK")
    private int idUsuarioIFK;

    // Relacion N a 1 con Usuario
    @ManyToOne
    @JoinColumn(name = "idUsuarioIFK", insertable = false, updatable = false)
    private Usuario Usuario;

    // Relacion 1 a N con RequisitoInscripcion
    @OneToMany(mappedBy = "Inscripcion")
    private List<RequisitoInscripcion> RequisitoInscripcion;

    public Inscripcion() {
    }

    public Inscripcion(int idInscripcion, String estadoInscripcion, String plazoInscripcion, int idUsuarioIFK) {
        this.idInscripcion = idInscripcion;
        this.estadoInscripcion = estadoInscripcion;
        this.plazoInscripcion = plazoInscripcion;
        this.idUsuarioIFK = idUsuarioIFK;
    }

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public String getEstadoInscripcion() {
        return estadoInscripcion;
    }

    public void setEstadoInscripcion(String estadoInscripcion) {
        this.estadoInscripcion = estadoInscripcion;
    }

    public String getPlazoInscripcion() {
        return plazoInscripcion;
    }

    public void setPlazoInscripcion(String plazoInscripcion) {
        this.plazoInscripcion = plazoInscripcion;
    }

    public int getIdUsuarioIFK() {
        return idUsuarioIFK;
    }

    public void setIdUsuarioIFK(int idUsuarioIFK) {
        this.idUsuarioIFK = idUsuarioIFK;
    }

}
