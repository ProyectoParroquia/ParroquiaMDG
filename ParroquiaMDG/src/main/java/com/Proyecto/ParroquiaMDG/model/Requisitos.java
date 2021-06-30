package com.Proyecto.ParroquiaMDG.model;

import java.util.List;

import javax.persistence.*;

// Entidad
@Entity
// Relacion Con Tabla BD
@Table(name = "Requisitos")
public class Requisitos {

    // Atributos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRequisitos;

    @Column(name = "denominacionRequisitos", length = 20)
    private String denominacionRequisitos;

    @Column(name = "idCursoRFK")
    private int idCursoRFK;

    // Relacion N a 1 con Curso
    @ManyToOne
    @JoinColumn(name = "idCursoRFK", insertable = false, updatable = false)
    private Curso Curso;

    // Relacion 1 a N con RequisitoInscripcion
    @OneToMany(mappedBy = "Requisitos")
    private List<RequisitoInscripcion> RequisitoInscripcion;

    public Requisitos() {
    }

    public Requisitos(int idRequisitos, String denominacionRequisitos, int idCursoRFK) {
        this.idRequisitos = idRequisitos;
        this.denominacionRequisitos = denominacionRequisitos;
        this.idCursoRFK = idCursoRFK;
    }

    public int getIdRequisitos() {
        return idRequisitos;
    }

    public void setIdRequisitos(int idRequisitos) {
        this.idRequisitos = idRequisitos;
    }

    public String getDenominacionRequisitos() {
        return denominacionRequisitos;
    }

    public void setDenominacionRequisitos(String denominacionRequisitos) {
        this.denominacionRequisitos = denominacionRequisitos;
    }

    public int getIdCursoRFK() {
        return idCursoRFK;
    }

    public void setIdCursoRFK(int idCursoRFK) {
        this.idCursoRFK = idCursoRFK;
    }

}
