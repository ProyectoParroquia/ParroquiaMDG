package com.Proyecto.ParroquiaMDG.model;

import java.util.List;

import javax.persistence.*;

// decora Entidad
@Entity
// Relacion Con Tabla BD
@Table(name = "tipoDocumento")
public class TipoDocumento {

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Tipo_Documento")
    private int idTipoDocumento;

    @Column(name = "denominacion_Tipo_Documento", length = 20)
    private String denominacionTipoDocumento;

    /*
     * // Relacion 1 a N con Usuario
     * 
     * @OneToMany(mappedBy = "Tipo_Documento") private List<Usuario> Usuario;
     */

    public TipoDocumento() {
    }

    // quite llave primaria porque si se usa para las pruebas un registro lo va a ir
    // llenando
    // insetar datos directamente test
    public TipoDocumento(String denominacionTipoDocumento) {

        this.denominacionTipoDocumento = denominacionTipoDocumento;
    }

    public int getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getDenominacionTipoDocumento() {
        return denominacionTipoDocumento;
    }

    public void setDenominacionTipoDocumento(String denominacionTipoDocumento) {
        this.denominacionTipoDocumento = denominacionTipoDocumento;
    }

}
