package model;

import java.util.List;

import javax.persistence.*;

// Entidad
@Entity
// Relacion Con Tabla BD
@Table(name = "Usuario")
public class Usuario {

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;

    @Column(name = "estadoUsuario", length = 10)
    private String estadoUsuario;

    @Column(name = "nombreUsuario", length = 15)
    private String nombreUsuario;

    @Column(name = "apellidoUsuario", length = 15)
    private String apellidoUsuario;

    @Column(name = "correoUsuario", length = 40)
    private String correoUsuario;

    @Column(name = "numeroDocumentoUsuario", length = 10)
    private int numeroDocumentoUsuario;

    @Column(name = "fechaNacimientoUsuario", length = 10)
    private String fechaNacimientoUsuario;

    @Column(name = "numeroDocumentoUsuario")
    private int idTipoDocumentoUFK;

    @Column(name = "idTipoUsuarioUFK")
    private int idTipoUsuarioUFK;

    // Relacion 1 a N con ServicioUsuario
    @OneToMany(mappedBy = "Usuario")
    private List<ServicioUsuario> ServicioUsuario;

    // Relacion 1 a N con Inscripcion
    @OneToMany(mappedBy = "Usuario")
    private List<Inscripcion> Inscripcion;

    // Relacion 1 a N con AnuncioUsuario
    @OneToMany(mappedBy = "Usuario")
    private List<AnuncioUsuario> AnuncioUsuario;

    // Relacion N a 1 con TipoDocumento
    @ManyToOne
    @JoinColumn(name = "idTipoDocumentoUFK", insertable = false, updatable = false)
    private TipoDocumento TipoDocumento;

    // Relacion N a 1 con TipoUsuario
    @ManyToOne
    @JoinColumn(name = "idTipoUsuarioUFK", insertable = false, updatable = false)
    private TipoUsuario TipoUsuario;

    public Usuario() {
    }

    public Usuario(int idUsuario, String estadoUsuario, String nombreUsuario, String apellidoUsuario,
            String correoUsuario, int numeroDocumentoUsuario, String fechaNacimientoUsuario, int idTipoDocumentoUFK,
            int idTipoUsuarioUFK, model.TipoDocumento tipoDocumento, model.TipoUsuario tipoUsuario) {
        this.idUsuario = idUsuario;
        this.estadoUsuario = estadoUsuario;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.correoUsuario = correoUsuario;
        this.numeroDocumentoUsuario = numeroDocumentoUsuario;
        this.fechaNacimientoUsuario = fechaNacimientoUsuario;
        this.idTipoDocumentoUFK = idTipoDocumentoUFK;
        this.idTipoUsuarioUFK = idTipoUsuarioUFK;
        TipoDocumento = tipoDocumento;
        TipoUsuario = tipoUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(String estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public int getNumeroDocumentoUsuario() {
        return numeroDocumentoUsuario;
    }

    public void setNumeroDocumentoUsuario(int numeroDocumentoUsuario) {
        this.numeroDocumentoUsuario = numeroDocumentoUsuario;
    }

    public String getFechaNacimientoUsuario() {
        return fechaNacimientoUsuario;
    }

    public void setFechaNacimientoUsuario(String fechaNacimientoUsuario) {
        this.fechaNacimientoUsuario = fechaNacimientoUsuario;
    }

    public int getIdTipoDocumentoUFK() {
        return idTipoDocumentoUFK;
    }

    public void setIdTipoDocumentoUFK(int idTipoDocumentoUFK) {
        this.idTipoDocumentoUFK = idTipoDocumentoUFK;
    }

    public int getIdTipoUsuarioUFK() {
        return idTipoUsuarioUFK;
    }

    public void setIdTipoUsuarioUFK(int idTipoUsuarioUFK) {
        this.idTipoUsuarioUFK = idTipoUsuarioUFK;
    }

    public TipoDocumento getTipoDocumento() {
        return TipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        TipoDocumento = tipoDocumento;
    }

    public TipoUsuario getTipoUsuario() {
        return TipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        TipoUsuario = tipoUsuario;
    }

}