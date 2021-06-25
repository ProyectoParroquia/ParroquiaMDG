package com.Proyecto.ParroquiaMDG.model;

import java.util.List;

import javax.persistence.*;

// Entidad
@Entity
// Relacion Con Tabla BD
@Table(name = "Servicio")
public class Servicio {

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idServicio;

    @Column(name = "estadoServicio", length = 10)
    private String estadoServicio;

    @Column(name = "fechaServicio", length = 10)
    private String fechaServicio;

    @Column(name = "peticionServicio", length = 10)
    private String peticionServicio;

    // Relacion 1 a N con TipoServicio
    // Con @OneToMany especificamos que es una relacion de 1 a muchos
    // mappedBy: el nombre atributo donde esta definida la relacion De la otra clase
    // participe de esta
    @OneToMany(mappedBy = "Servicio")
    // definomos el atributo con un tipo de dato list porque va a almacenar los
    // datos que llegen de la otra tabla
    private List<tipoServicio> tipoServicio;

    // Relacion 1 a N con ServicioUsuario
    @OneToMany(mappedBy = "Servicio")
    private List<ServicioUsuario> ServicioUsuario;

    public Servicio() {
    }

    public Servicio(int idServicio, String estadoServicio, String fechaServicio, String peticionServicio) {
        this.idServicio = idServicio;
        this.estadoServicio = estadoServicio;
        this.fechaServicio = fechaServicio;
        this.peticionServicio = peticionServicio;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public String getEstadoServicio() {
        return estadoServicio;
    }

    public void setEstadoServicio(String estadoServicio) {
        this.estadoServicio = estadoServicio;
    }

    public String getFechaServicio() {
        return fechaServicio;
    }

    public void setFechaServicio(String fechaServicio) {
        this.fechaServicio = fechaServicio;
    }

    public String getPeticionServicio() {
        return peticionServicio;
    }

    public void setPeticionServicio(String peticionServicio) {
        this.peticionServicio = peticionServicio;
    }

}
