package com.Proyecto.ParroquiaMDG.DTO;

public class TipoDocumentoDTO {

    private int idTipoDocumento;
    private String denominacionTipoDocumento;

    public TipoDocumentoDTO() {
    }

    public TipoDocumentoDTO(int idTipoDocumento, String denominacionTipoDocumento) {
        this.setIdTipoDocumento(idTipoDocumento);
        this.setDenominacionTipoDocumento(denominacionTipoDocumento);
    }

    public String getDenominacionTipoDocumento() {
        return denominacionTipoDocumento;
    }

    public void setDenominacionTipoDocumento(String denominacionTipoDocumento) {
        this.denominacionTipoDocumento = denominacionTipoDocumento;
    }

    public int getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

}
