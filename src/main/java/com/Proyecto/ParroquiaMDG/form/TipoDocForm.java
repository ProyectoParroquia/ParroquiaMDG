package com.Proyecto.ParroquiaMDG.form;

import com.Proyecto.ParroquiaMDG.DTO.TipoDocumentoDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TipoDocForm {
    private TipoDocumentoDTO tdoc;

    public TipoDocForm() {
    }

    public TipoDocForm(TipoDocumentoDTO tdoc) {
        this.tdoc = tdoc;
    }

    public TipoDocumentoDTO getTdoc() {
        return tdoc;
    }

    public void setTdoc(TipoDocumentoDTO tdoc) {
        this.tdoc = tdoc;
    }

}