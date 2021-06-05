package model;

import java.util.List;

import javax.persistence.*;

// Entidad
@Entity
// Relacion Con Tabla BD
@Table(name = "tipoCurso")
public class TipoCurso {
    // Atributos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoCurso;

    @Column(name = "categoriaCurso", length = 20)
    private String categoriaCurso;

    // Relacion 1 a N con Curso
    @OneToMany(mappedBy = "TipoCurso")
    private List<Curso> Curso;

    public TipoCurso(int idTipoCurso, String categoriaCurso) {
        this.idTipoCurso = idTipoCurso;
        this.categoriaCurso = categoriaCurso;
    }

    public TipoCurso() {
    }

    public int getIdTipoCurso() {
        return idTipoCurso;
    }

    public void setIdTipoCurso(int idTipoCurso) {
        this.idTipoCurso = idTipoCurso;
    }

    public String getCategoriaCurso() {
        return categoriaCurso;
    }

    public void setCategoriaCurso(String categoriaCurso) {
        this.categoriaCurso = categoriaCurso;
    }

}
