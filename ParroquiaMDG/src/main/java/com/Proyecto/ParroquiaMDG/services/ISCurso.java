package com.Proyecto.ParroquiaMDG.services;

import java.util.List;

import com.Proyecto.ParroquiaMDG.DTO.*;

public interface ISCurso {
    public CursoDTO save(CursoDTO Curso); // Registrar y actualizar

    public List<CursoDTO> getAll(); // consultar todos los registros

    public CursoDTO get(Integer idCurso);

    public void delete(Integer idCurso);
}
