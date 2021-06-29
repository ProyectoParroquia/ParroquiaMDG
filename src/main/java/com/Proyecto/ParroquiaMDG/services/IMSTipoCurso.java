package com.Proyecto.ParroquiaMDG.services;

import java.util.List;
import java.util.stream.Collectors;

import com.Proyecto.ParroquiaMDG.DTO.TipoCursoDTO;
import com.Proyecto.ParroquiaMDG.model.TipoCurso;
import com.Proyecto.ParroquiaMDG.repositorys.TipoCursoRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IMSTipoCurso implements ISTipoCurso {
    @Autowired
    private TipoCursoRepository repoTCur;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public TipoCursoDTO save(TipoCursoDTO tipoCurso) {
        TipoCurso TiCursoEntity = modelMapper.map(tipoCurso, TipoCurso.class);
        TiCursoEntity = repoTCur.save(TiCursoEntity);
        return modelMapper.map(TiCursoEntity, TipoCursoDTO.class);

    }

    @Override
    public List<TipoCursoDTO> getAll() {
        List<TipoCurso> listTcEntity = repoTCur.findAll();
        List<TipoCursoDTO> listTcDto = listTcEntity.stream().map(role -> modelMapper.map(role, TipoCursoDTO.class))
                .collect(Collectors.toList());

        return listTcDto;
    }

    @Override
    public TipoCursoDTO get(Integer idTipoCurso) {
        TipoCurso TiCursoEntity = repoTCur.getById(idTipoCurso);
        TipoCursoDTO TipoCursoDto = modelMapper.map(TiCursoEntity, TipoCursoDTO.class);
        return TipoCursoDto;
    }

    @Override
    public void delete(Integer idTipoCurso) {
        repoTCur.deleteById(idTipoCurso);

    }

}
