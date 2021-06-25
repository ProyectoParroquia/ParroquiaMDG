package com.Proyecto.ParroquiaMDG.services;

import java.util.List;

import com.Proyecto.ParroquiaMDG.DTO.TipoCursoDTO;

public interface ISTipoCurso {
    public TipoCursoDTO save(TipoCursoDTO tipoCurso);

    public List<TipoCursoDTO> getAll();

    public TipoCursoDTO get(Integer idTipoCurso);

    public void delete(Integer idTipoCurso);
}
