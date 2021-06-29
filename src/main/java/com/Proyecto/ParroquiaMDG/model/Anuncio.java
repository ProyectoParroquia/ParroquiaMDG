package com.Proyecto.ParroquiaMDG.model;

import java.util.List;

import javax.persistence.*;

// Entidad
@Entity
// Relacion Con Tabla BD
@Table(name = "Anuncio")
public class Anuncio {

    // Atributos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAnuncio;

    @Column(name = "estadoAnuncio", length = 10)
    private String estadoAnuncio;

    @Column(name = "nombreAnuncio", length = 20)
    private String nombreAnuncio;

    @Column(name = "mensajeAnuncio", length = 100)
    private String mensajeAnuncio;

    @Column(name = "destinatarioAnuncio", length = 20)
    private String destinatarioAnuncio;

    @Column(name = "duracionAnuncio")
    private String duracionAnuncio;

    // Relacion 1 a N con AnuncioUsuario
    @OneToMany(mappedBy = "Anuncio")
    private List<AnuncioUsuario> AnuncioUsuario;

    public Anuncio() {
    }

    public Anuncio(int idAnuncio, String estadoAnuncio, String nombreAnuncio, String mensajeAnuncio,
            String destinatarioAnuncio, String duracionAnuncio) {
        this.idAnuncio = idAnuncio;
        this.estadoAnuncio = estadoAnuncio;
        this.nombreAnuncio = nombreAnuncio;
        this.mensajeAnuncio = mensajeAnuncio;
        this.destinatarioAnuncio = destinatarioAnuncio;
        this.duracionAnuncio = duracionAnuncio;
    }

    public int getIdAnuncio() {
        return idAnuncio;
    }

    public void setIdAnuncio(int idAnuncio) {
        this.idAnuncio = idAnuncio;
    }

    public String getEstadoAnuncio() {
        return estadoAnuncio;
    }

    public void setEstadoAnuncio(String estadoAnuncio) {
        this.estadoAnuncio = estadoAnuncio;
    }

    public String getNombreAnuncio() {
        return nombreAnuncio;
    }

    public void setNombreAnuncio(String nombreAnuncio) {
        this.nombreAnuncio = nombreAnuncio;
    }

    public String getMensajeAnuncio() {
        return mensajeAnuncio;
    }

    public void setMensajeAnuncio(String mensajeAnuncio) {
        this.mensajeAnuncio = mensajeAnuncio;
    }

    public String getDestinatarioAnuncio() {
        return destinatarioAnuncio;
    }

    public void setDestinatarioAnuncio(String destinatarioAnuncio) {
        this.destinatarioAnuncio = destinatarioAnuncio;
    }

    public String getDuracionAnuncio() {
        return duracionAnuncio;
    }

    public void setDuracionAnuncio(String duracionAnuncio) {
        this.duracionAnuncio = duracionAnuncio;
    }

}
