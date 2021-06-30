package com.Proyecto.ParroquiaMDG.services;

import java.util.List;

import com.Proyecto.ParroquiaMDG.DTO.TipoDocumentoDTO;

public interface ISTipoDoc {
    public TipoDocumentoDTO save(TipoDocumentoDTO tipoDoc); // Registrar y actualizar

    public List<TipoDocumentoDTO> getAll(); // consultar todos los registros

    public TipoDocumentoDTO get(Integer idTipoDoc);

    public void delete(Integer idTipoDoc);
}
