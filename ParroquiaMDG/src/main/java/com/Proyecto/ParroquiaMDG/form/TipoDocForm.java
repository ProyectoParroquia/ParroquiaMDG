package com.Proyecto.ParroquiaMDG.form;

import com.Proyecto.ParroquiaMDG.DTO.TipoDocumentoDTO;




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