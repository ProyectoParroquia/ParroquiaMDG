package com.Proyecto.ParroquiaMDG.Controller.Rest;

import java.util.List;

import com.Proyecto.ParroquiaMDG.DTO.CursoDTO;
import com.Proyecto.ParroquiaMDG.services.IMSCurso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/Curso")
public class restControllerCurso {

    @Autowired

    IMSCurso curservice;

    @GetMapping("/all")
    public List<CursoDTO> getAll(){
        return curservice.getAll();
    }
    @GetMapping("/{idCurso}")

    public CursoDTO getCurso(@PathVariable("idCurso") Integer idCurso){
        return curservice.get(idCurso);
    }
@PostMapping("/new")
public CursoDTO newCurso(@RequestBody CursoDTO curso){
    return curservice.save(curso);

}
  @PutMapping("/update")  
  public CursoDTO updateCurso(@RequestBody CursoDTO curso){
      return curservice.save(curso);
  }
  @DeleteMapping("/delete/{idCurso}")
  public void deleteCurso(@PathVariable("idCurso")Integer idCurso){
    curservice.delete(idCurso);
  }
}
