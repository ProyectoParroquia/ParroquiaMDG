package com.Proyecto.ParroquiaMDG.form;

import com.Proyecto.ParroquiaMDG.DTO.TipoCursoDTO;

public class TipoCursoForm {
    private TipoCursoDTO tipCurso;

    public TipoCursoForm() {
    }

    public TipoCursoForm(TipoCursoDTO tipCurso) {
        this.tipCurso = tipCurso;
    }

    public TipoCursoDTO getTipCurso() {
        return tipCurso;
    }

    public void setTipCurso(TipoCursoDTO tipCurso) {
        this.tipCurso = tipCurso;
    }

}
