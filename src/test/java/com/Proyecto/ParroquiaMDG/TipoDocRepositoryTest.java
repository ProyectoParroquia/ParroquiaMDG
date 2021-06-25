package com.Proyecto.ParroquiaMDG;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.Proyecto.ParroquiaMDG.model.TipoDocumento;
import com.Proyecto.ParroquiaMDG.repositorys.TipoDocRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

//genera pruebas de las acciones 
//no afecta bd, solo son pruebas de comunicacion sin escribir datos

//anotacion para marcar la clase como case de testeo
@DataJpaTest
// comunicarBD, PERMITIRA QUE NO sean escritos en la bd
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class TipoDocRepositoryTest {
    // permite relacionar la clase con el repos.
    @Autowired
    TipoDocRepository repotipdoc;

    @Test
    public void tipoDocTest() {
        // INTANCIA EN ENTITY
        // realmente es un representamiento de un entity
        TipoDocumento tdoc1 = new TipoDocumento("Cedula de ciudadania");
        TipoDocumento tdoc2 = new TipoDocumento("Tarjeta de Identidad");

        repotipdoc.save(tdoc1);
        repotipdoc.save(tdoc2);

        // Sirve para generar elementos teporales
        repotipdoc.flush();

        // metodos asserts libreria :junit ---sirven para realizar diferentes tipos de
        // testeo
        // cantidad datos que inserte luego hago la consulta de solo la Cantidad de
        // registros
        assertEquals(2, repotipdoc.findAll().size());
        // 10 junio
    }
}
