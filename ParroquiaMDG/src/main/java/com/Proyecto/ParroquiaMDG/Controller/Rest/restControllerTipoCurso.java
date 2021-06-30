package com.Proyecto.ParroquiaMDG.Controller.Rest;
import java.util.List;

import com.Proyecto.ParroquiaMDG.DTO.TipoCursoDTO;
import com.Proyecto.ParroquiaMDG.services.IMSTipoCurso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/TipoCurso")
@CrossOrigin(origins ={"*"})
public class restControllerTipoCurso {

    @Autowired

    IMSTipoCurso Tipocurservice;

    @GetMapping("/all")
    public List<TipoCursoDTO> getAll(){
        return Tipocurservice.getAll();
    }
    @GetMapping("/{idTipoCurso}")

    public TipoCursoDTO getCurso(@PathVariable("idTipoCurso") Integer idTipoCurso){
        return Tipocurservice.get(idTipoCurso);
    }
@PostMapping("/new")
public TipoCursoDTO newTipCurso(@RequestBody TipoCursoDTO Tipocurso){
    return Tipocurservice.save(Tipocurso);

}
  @PutMapping("/update")  
  public TipoCursoDTO updateTipoCurso(@RequestBody TipoCursoDTO Tipocurso){
      return Tipocurservice.save(Tipocurso);
  }
  @DeleteMapping("/delete/{idTipoCurso}")
  public void deleteTipoCurso(@PathVariable("idTipoCurso")Integer idTipoCurso){
    Tipocurservice.delete(idTipoCurso);
  }
}


