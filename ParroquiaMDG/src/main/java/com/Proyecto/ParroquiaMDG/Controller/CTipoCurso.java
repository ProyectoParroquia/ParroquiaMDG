package com.Proyecto.ParroquiaMDG.Controller;

import java.util.HashMap;

import com.Proyecto.ParroquiaMDG.DTO.TipoCursoDTO;
import com.Proyecto.ParroquiaMDG.form.TipoCursoForm;
import com.Proyecto.ParroquiaMDG.services.ISTipoCurso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/tipoCurso")
public class CTipoCurso {
    @Autowired
    ISTipoCurso tcservice;

    @GetMapping("/show")
    public ModelAndView show() {
        // generamos nuevo mapa
        var params = new HashMap<String, Object>();
        // con put agrego a la vista lo de la interfaz
        params.put("ListTc", tcservice.getAll());
        return new ModelAndView("tipoCurso", params);
    }

    @GetMapping("/new")
    public ModelAndView NewTipoCurso() {
        // generamos nuevo mapa
        var params = new HashMap<String, Object>();
        // instancia para cargar el foormulario
        TipoCursoForm form = new TipoCursoForm();
        form.setTipCurso(new TipoCursoDTO());
        // con put agrego a la vista lo de la interfaz
        params.put("form", form);
        return new ModelAndView("FormTipoCurso", params);

    }

    // guardar esos datos
    // cargar no, enviar a objeto se necesita via post
    @PostMapping("/save")
    public ModelAndView save(TipoCursoForm form) {
        tcservice.save(form.getTipCurso());
        return new ModelAndView("redirect:/tipoCurso/show");
    }

    @GetMapping("/edit/{idTipoCurso}")
    public ModelAndView edit(@ModelAttribute("idTipoCurso") Integer idTipoCurso) {
        var params = new HashMap<String, Object>();
        TipoCursoForm form = new TipoCursoForm();
        form.setTipCurso(tcservice.get(idTipoCurso));
        params.put("form", form);
        return new ModelAndView("FormTipoCurso", params);
    }

    @GetMapping("/delete/{idTipoCurso}")
    public ModelAndView delete(@ModelAttribute("idTipoCurso") Integer idTipoCurso) {
        tcservice.delete(idTipoCurso);
        return new ModelAndView("redirect:/tipoCurso/show");
    }
}
