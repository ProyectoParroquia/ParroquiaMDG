package com.Proyecto.ParroquiaMDG.Controller;

import java.util.HashMap;

import com.Proyecto.ParroquiaMDG.DTO.TipoDocumentoDTO;
import com.Proyecto.ParroquiaMDG.form.TipoDocForm;
import com.Proyecto.ParroquiaMDG.services.ISTipoDoc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//Marcacion
@Controller
// Definir rutas para acceder a este modulo
@RequestMapping("/tipodoc") // establece ruta de la vista
public class CTipoDocumento {
    // implementacion de clase
    @Autowired
    ISTipoDoc tdservice;

    // sub-ruta que proviene de get
    // ruta de la accion
    @GetMapping("/show") // establece ruta de la acción
    // permite pasar valores a vista
    public ModelAndView show() {
        // generamos nuevo mapa
        var params = new HashMap<String, Object>();
        // con put agrego a la vista lo de la interfaz
        params.put("ListTd", tdservice.getAll());
        return new ModelAndView("tipodoc", params);
    }

    @GetMapping("/new")
    public ModelAndView NewTipoDoc() {
        // generamos nuevo mapa
        var params = new HashMap<String, Object>();
        // instancia para cargar el foormulario
        TipoDocForm form = new TipoDocForm();
        form.setTdoc(new TipoDocumentoDTO());
        // con put agrego a la vista lo de la interfaz
        params.put("form", form);
        return new ModelAndView("Formtipodoc", params);

    }

    // guardar esos datos
    // cargar no, enviar a objeto se necesita via post
    @PostMapping("/save")
    public ModelAndView save(TipoDocForm form) {
        tdservice.save(form.getTdoc());
        return new ModelAndView("redirect:/tipodoc/show");
    }

    @GetMapping("/edit/{idTipoDoc}")
    public ModelAndView edit(@ModelAttribute("idTipoDoc") Integer idTipoDocumento) {
        var params = new HashMap<String, Object>();
        TipoDocForm form = new TipoDocForm();
        form.setTdoc(tdservice.get(idTipoDocumento));
        params.put("form", form);
        return new ModelAndView("Formtipodoc", params);
    }

    @GetMapping("/delete/{idTipoDoc}")
    public ModelAndView delete(@ModelAttribute("idTipoDoc") Integer idTipoDocumento) {
        tdservice.delete(idTipoDocumento);
        return new ModelAndView("redirect:/tipodoc/show");
    }
}
