package com.Proyecto.ParroquiaMDG.repositorys;

import com.Proyecto.ParroquiaMDG.model.TipoCurso;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoCursoRepository extends JpaRepository<TipoCurso, Integer> {

}
