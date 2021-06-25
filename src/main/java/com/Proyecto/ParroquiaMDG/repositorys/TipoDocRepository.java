package com.Proyecto.ParroquiaMDG.repositorys;

import com.Proyecto.ParroquiaMDG.model.TipoDocumento;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
// crud o jpa repository para trabajar con los metodos para crud,
// en operadores diamante se pone la entidad y tipo de dato de la llave primaria
public interface TipoDocRepository extends JpaRepository<TipoDocumento, Integer> {

}
