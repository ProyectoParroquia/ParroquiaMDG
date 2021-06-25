package com.Proyecto.ParroquiaMDG.DTO;

public class CursoDTO {
    private int idCurso;
    private String estadoCurso;
    private String nombreCurso;
    private String fechaInicialCurso;
    private String fechaFinalCurso;
    private int costoCurso;
    private int idTipoCursoFK;
    private TipoCursoDTO TipoCurso;

    public CursoDTO() {
    }

    public CursoDTO(int idCurso, String estadoCurso, String nombreCurso, String fechaInicialCurso,
            String fechaFinalCurso, int costoCurso, int idTipoCursoFK, TipoCursoDTO tipoCurso) {
        this.idCurso = idCurso;
        this.estadoCurso = estadoCurso;
        this.nombreCurso = nombreCurso;
        this.fechaInicialCurso = fechaInicialCurso;
        this.fechaFinalCurso = fechaFinalCurso;
        this.costoCurso = costoCurso;
        this.idTipoCursoFK = idTipoCursoFK;
        TipoCurso = tipoCurso;
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

    public TipoCursoDTO getTipoCurso() {
        return TipoCurso;
    }

    public void setTipoCurso(TipoCursoDTO tipoCurso) {
        TipoCurso = tipoCurso;
    }

}
