package com.Proyecto.ParroquiaMDG.model;

import javax.persistence.*;

// Entidad
@Entity
// Relacion Con Tabla BD
@Table(name = "requisitoInscripcion")
public class RequisitoInscripcion {
    // Atributos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRequisitoInscripcion;

    @Column(name = "idRequisitosRIFK")
    private int idRequisitosRIFK;

    @Column(name = "idInscripcionRIFK")
    private int idInscripcionRIFK;

    @Column(name = "urlRequisito", length = 40)
    private String urlRequisito;

    // Relacion N a 1 con Inscripcion
    @ManyToOne
    @JoinColumn(name = "idInscripcionRIFK", insertable = false, updatable = false)
    private Inscripcion Inscripcion;

    // Relacion N a 1 con Requisitos
    @ManyToOne
    @JoinColumn(name = "idRequisitosRIFK", insertable = false, updatable = false)
    private Requisitos Requisitos;

    public RequisitoInscripcion() {
    }

    public RequisitoInscripcion(int idRequisitoInscripcion, int idRequisitosRIFK, int idInscripcionRIFK,
            String urlRequisito) {
        this.idRequisitoInscripcion = idRequisitoInscripcion;
        this.idRequisitosRIFK = idRequisitosRIFK;
        this.idInscripcionRIFK = idInscripcionRIFK;
        this.urlRequisito = urlRequisito;
    }

    public int getIdRequisitoInscripcion() {
        return idRequisitoInscripcion;
    }

    public void setIdRequisitoInscripcion(int idRequisitoInscripcion) {
        this.idRequisitoInscripcion = idRequisitoInscripcion;
    }

    public int getIdRequisitosRIFK() {
        return idRequisitosRIFK;
    }

    public void setIdRequisitosRIFK(int idRequisitosRIFK) {
        this.idRequisitosRIFK = idRequisitosRIFK;
    }

    public int getIdInscripcionRIFK() {
        return idInscripcionRIFK;
    }

    public void setIdInscripcionRIFK(int idInscripcionRIFK) {
        this.idInscripcionRIFK = idInscripcionRIFK;
    }

    public String getUrlRequisito() {
        return urlRequisito;
    }

    public void setUrlRequisito(String urlRequisito) {
        this.urlRequisito = urlRequisito;
    }

}
