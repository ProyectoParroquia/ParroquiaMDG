package com.Proyecto.ParroquiaMDG.model;

import javax.persistence.*;

//Definir como entidad
@Entity
// Relacionar con una tabla en la base de datos
@Table(name = "Barrio")
// Creacion de una clase comun y corriente
public class tipoServicio {

    // Atributos de la clase

    // Para decir que es el campo identificador de la tabla
    @Id
    // En este caso el Generated...etc nos establece que el campo es
    // autoincrementable
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Creamos nuestro atributo (privado por seguridad blablabla)
    // Mejor poner el mismo nombre que en la bd y tipo de dato
    private int idTipoServicio;

    // Para decir que haremos referencia a una columna(otro campo) en nuestra bd
    // name: Para el nombre talcual está en la bd
    // length: Para el tamaño del campo
    @Column(name = "denominacionServicio", length = 20)
    private String denominacionServicio;

    // Campo para la llave foranea (un campo normal solo que es importante mirar el
    // tipo de dato blablabla)
    @Column(name = "idServicioFK")
    private int idServicioFK;

    // Relaciones Con otras Tablas

    // Relacion N a 1 con la tabla/entidad Servicio
    // Con @MayToOne especificamos que es una relacion de muchos a 1
    @ManyToOne
    // @JoinColumn
    // name: Decimos a que columna se le va a asignar la relacion

    // (insertable = false, updatable = false)Nos sirven para decir que es una llave
    // foranea y que el valor le llega de otra tabla por ende no se puede insertar
    // ni actualizar
    @JoinColumn(name = "idServicioFK", insertable = false, updatable = false)
    // declaramos nuestro atributo que va a almacenar esta info donde como tipo de
    // dato ponemos la clase con la que se relaciona
    private Servicio Servicio;

    public tipoServicio() {
    }

    public tipoServicio(int idTipoServicio, String denominacionServicio, int idServicioFK) {
        this.idTipoServicio = idTipoServicio;
        this.denominacionServicio = denominacionServicio;
        this.idServicioFK = idServicioFK;
    }

    public int getIdTipoServicio() {
        return idTipoServicio;
    }

    public void setIdTipoServicio(int idTipoServicio) {
        this.idTipoServicio = idTipoServicio;
    }

    public String getDenominacionServicio() {
        return denominacionServicio;
    }

    public void setDenominacionServicio(String denominacionServicio) {
        this.denominacionServicio = denominacionServicio;
    }

    public int getIdServicioFK() {
        return idServicioFK;
    }

    public void setIdServicioFK(int idServicioFK) {
        this.idServicioFK = idServicioFK;
    }

}
