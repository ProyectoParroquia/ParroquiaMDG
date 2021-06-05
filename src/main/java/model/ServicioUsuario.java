package model;

import javax.persistence.*;

// Entidad
@Entity
// Relacion Con Tabla BD
@Table(name = "ServicioUsuario")
public class ServicioUsuario {

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idServicioUsuario;

    @Column(name = "idServicioSFK")
    private int idServicioSFK;

    @Column(name = "idUsuarioSFK")
    private int idUsuarioSFK;

    @Column(name = "montoDonacion")
    private int montoDonacion;

    // Relacion N a 1 con Servicio
    @ManyToOne
    @JoinColumn(name = "idServicioSFK", insertable = false, updatable = false)
    private Servicio Servicio;

    // Relacion N a 1 con Usuario
    @ManyToOne
    @JoinColumn(name = "idUsuarioSFK", insertable = false, updatable = false)
    private Usuario Usuario;

    public ServicioUsuario() {
    }

    public ServicioUsuario(int idServicioUsuario, int idServicioSFK, int idUsuarioSFK, int montoDonacion) {
        this.idServicioUsuario = idServicioUsuario;
        this.idServicioSFK = idServicioSFK;
        this.idUsuarioSFK = idUsuarioSFK;
        this.montoDonacion = montoDonacion;
    }

    public int getIdServicioUsuario() {
        return idServicioUsuario;
    }

    public void setIdServicioUsuario(int idServicioUsuario) {
        this.idServicioUsuario = idServicioUsuario;
    }

    public int getIdServicioSFK() {
        return idServicioSFK;
    }

    public void setIdServicioSFK(int idServicioSFK) {
        this.idServicioSFK = idServicioSFK;
    }

    public int getIdUsuarioSFK() {
        return idUsuarioSFK;
    }

    public void setIdUsuarioSFK(int idUsuarioSFK) {
        this.idUsuarioSFK = idUsuarioSFK;
    }

    public int getMontoDonacion() {
        return montoDonacion;
    }

    public void setMontoDonacion(int montoDonacion) {
        this.montoDonacion = montoDonacion;
    }

}