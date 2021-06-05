package model;

import java.util.List;

import javax.persistence.*;

// Entidad
@Entity
// Relacion Con Tabla BD
@Table(name = "Curso")
public class Curso {

    // Atributos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCurso;

    @Column(name = "estadoCurso", length = 10)
    private String estadoCurso;

    @Column(name = "nombreCurso", length = 20)
    private String nombreCurso;

    @Column(name = "fechaInicialCurso", length = 10)
    private String fechaInicialCurso;

    @Column(name = "fechaFinalCurso", length = 10)
    private String fechaFinalCurso;

    @Column(name = "costoCurso")
    private int costoCurso;

    @Column(name = "idTipoCursoFK")
    private int idTipoCursoFK;

    // Relacion N a 1 con TipoCurso
    @ManyToOne
    @JoinColumn(name = "idTipoCursoFK", insertable = false, updatable = false)
    private TipoCurso TipoCurso;

    // Relacion 1 a N con Requisitos
    @OneToMany(mappedBy = "Curso")
    private List<Requisitos> Requisitos;

    public Curso() {
    }

    public Curso(int idCurso, String estadoCurso, String nombreCurso, String fechaInicialCurso, String fechaFinalCurso,
            int costoCurso, int idTipoCursoFK) {
        this.idCurso = idCurso;
        this.estadoCurso = estadoCurso;
        this.nombreCurso = nombreCurso;
        this.fechaInicialCurso = fechaInicialCurso;
        this.fechaFinalCurso = fechaFinalCurso;
        this.costoCurso = costoCurso;
        this.idTipoCursoFK = idTipoCursoFK;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getEstadoCurso() {
        return estadoCurso;
    }

    public void setEstadoCurso(String estadoCurso) {
        this.estadoCurso = estadoCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getFechaInicialCurso() {
        return fechaInicialCurso;
    }

    public void setFechaInicialCurso(String fechaInicialCurso) {
        this.fechaInicialCurso = fechaInicialCurso;
    }

    public String getFechaFinalCurso() {
        return fechaFinalCurso;
    }

    public void setFechaFinalCurso(String fechaFinalCurso) {
        this.fechaFinalCurso = fechaFinalCurso;
    }

    public int getCostoCurso() {
        return costoCurso;
    }

    public void setCostoCurso(int costoCurso) {
        this.costoCurso = costoCurso;
    }

    public int getIdTipoCursoFK() {
        return idTipoCursoFK;
    }

    public void setIdTipoCursoFK(int idTipoCursoFK) {
        this.idTipoCursoFK = idTipoCursoFK;
    }

}
