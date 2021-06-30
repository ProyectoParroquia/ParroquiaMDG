package com.Proyecto.ParroquiaMDG.form;

import java.util.List;

import com.Proyecto.ParroquiaMDG.DTO.CursoDTO;
import com.Proyecto.ParroquiaMDG.DTO.TipoCursoDTO;

public class CursoForm {
    private CursoDTO Curso;
    private TipoCursoDTO tipoCurso;
    private List<TipoCursoDTO> lTCur;

    public CursoForm() {
    }

    public CursoDTO getCurso() {
        return Curso;
    }

    public void setCurso(CursoDTO curso) {
        Curso = curso;
    }

    public TipoCursoDTO getTipoCurso() {
        return tipoCurso;
    }

    public void setTipoCurso(TipoCursoDTO tipoCurso) {
        this.tipoCurso = tipoCurso;
    }

    public List<TipoCursoDTO> getlTCur() {
        return lTCur;
    }

    public void setlTCur(List<TipoCursoDTO> lTCur) {
        this.lTCur = lTCur;
    }

}
