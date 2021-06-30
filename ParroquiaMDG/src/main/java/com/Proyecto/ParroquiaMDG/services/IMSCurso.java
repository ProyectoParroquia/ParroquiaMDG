package com.Proyecto.ParroquiaMDG.services;

import java.util.List;
import java.util.stream.Collectors;

import com.Proyecto.ParroquiaMDG.DTO.CursoDTO;
import com.Proyecto.ParroquiaMDG.model.Curso;
import com.Proyecto.ParroquiaMDG.repositorys.CursoRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IMSCurso implements ISCurso {
    @Autowired
    private CursoRepository repoCurso;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CursoDTO save(CursoDTO curso) {
        Curso CursoEntity = modelMapper.map(curso, Curso.class);
        CursoEntity = repoCurso.save(CursoEntity);
        return modelMapper.map(CursoEntity, CursoDTO.class);
    }

    @Override
    public List<CursoDTO> getAll() {
        List<Curso> listCEntity = repoCurso.findAll();
        List<CursoDTO> listCDto = listCEntity.stream().map(role -> modelMapper.map(role, CursoDTO.class))
                .collect(Collectors.toList());

        return listCDto;
    }

    @Override
    public CursoDTO get(Integer idCurso) {
        Curso CEntity = repoCurso.getById(idCurso);
        CursoDTO cDto = modelMapper.map(CEntity, CursoDTO.class);
        return cDto;
    }

    @Override
    public void delete(Integer idCurso) {
        repoCurso.deleteById(idCurso);

    }

}
