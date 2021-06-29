package com.Proyecto.ParroquiaMDG.services;

import java.util.List;
import java.util.stream.Collectors;

import com.Proyecto.ParroquiaMDG.DTO.TipoDocumentoDTO;
import com.Proyecto.ParroquiaMDG.model.TipoDocumento;
import com.Proyecto.ParroquiaMDG.repositorys.TipoDocRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IMTipoDocumento implements ISTipoDoc {
    @Autowired
    private TipoDocRepository repoTdoc;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public TipoDocumentoDTO save(TipoDocumentoDTO tipoDoc) {
        TipoDocumento TiDocEntity = modelMapper.map(tipoDoc, TipoDocumento.class);
        TiDocEntity = repoTdoc.save(TiDocEntity);
        return modelMapper.map(TiDocEntity, TipoDocumentoDTO.class);

    }

    @Override
    public List<TipoDocumentoDTO> getAll() {
        List<TipoDocumento> listTdEntity = repoTdoc.findAll();
        List<TipoDocumentoDTO> listTdDto = listTdEntity.stream()
                .map(role -> modelMapper.map(role, TipoDocumentoDTO.class)).collect(Collectors.toList());

        return listTdDto;
    }

    @Override
    public TipoDocumentoDTO get(Integer id) {
        TipoDocumento tdEntity = repoTdoc.getById(id);
        TipoDocumentoDTO tDto = modelMapper.map(tdEntity, TipoDocumentoDTO.class);
        return tDto;
    }

    @Override
    public void delete(Integer idTipoDoc) {
        repoTdoc.deleteById(idTipoDoc);
    }

}
