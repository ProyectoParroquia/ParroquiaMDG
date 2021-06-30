package com.Proyecto.ParroquiaMDG.DTO;

public class TipoCursoDTO {
    private int idTipoCurso;
    private String categoriaCurso;

    public TipoCursoDTO() {
    }

    public TipoCursoDTO(int idTipoCurso, String categoriaCurso) {
        this.idTipoCurso = idTipoCurso;
        this.categoriaCurso = categoriaCurso;
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
