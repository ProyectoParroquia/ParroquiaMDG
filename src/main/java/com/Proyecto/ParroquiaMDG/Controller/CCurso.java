package com.Proyecto.ParroquiaMDG.Controller;

import java.util.HashMap;
import java.util.List;

import com.Proyecto.ParroquiaMDG.DTO.CursoDTO;
import com.Proyecto.ParroquiaMDG.DTO.TipoCursoDTO;
import com.Proyecto.ParroquiaMDG.form.CursoForm;
import com.Proyecto.ParroquiaMDG.services.IMSCurso;
import com.Proyecto.ParroquiaMDG.services.IMSTipoCurso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/Curso")
public class CCurso {

    @Autowired
    IMSCurso Cservice;

    @Autowired
    IMSTipoCurso tcservice;

    @GetMapping(value = "/show")
    public ModelAndView showCurso() {

        List<CursoDTO> Cursos = Cservice.getAll();
        List<TipoCursoDTO> tipoCurso = tcservice.getAll();

        var params = new HashMap<String, Object>();
        params.put("listCu", Cursos);
        params.put("listTc", tipoCurso);

        return new ModelAndView("Curso", params);

    }

    @GetMapping(value = "/new")
    public ModelAndView newCurso() {
        CursoForm form = new CursoForm();
        form.setCurso(new CursoDTO());
        form.setlTCur(tcservice.getAll());

        var params = new HashMap<String, Object>();

        params.put("form", form);

        return new ModelAndView("FormCurso", params);

    }

    @PostMapping(value = "/save")
    public ModelAndView save(CursoForm CUForm) {
        Cservice.save(CUForm.getCurso());
        return new ModelAndView("redirect:/Curso/show");
    }

    @GetMapping(value = "/edit/{idCurso}")
    public ModelAndView editCurso(@ModelAttribute("idCurso") Integer idCurso) {

        CursoForm form = new CursoForm();
        form.setCurso(Cservice.get(idCurso));
        form.setlTCur(tcservice.getAll());

        var params = new HashMap<String, Object>();
        params.put("form", form);

        return new ModelAndView("CursoForm", params);

    }

    @GetMapping(value = "/delete/{idCurso}")
    public ModelAndView deleteCurso(@ModelAttribute("idCurso") Integer idCurso) {
        Cservice.delete(idCurso);
        return new ModelAndView("redirect:/Curso/show");
    }
}
