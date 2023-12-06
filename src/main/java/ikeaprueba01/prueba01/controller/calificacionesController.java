package ikeaprueba01.prueba01.controller;

import ikeaprueba01.prueba01.services.CalificacionesServices;
import org.springframework.web.bind.annotation.*;

import ikeaprueba01.prueba01.model.calificaciones;
@RestController
@RequestMapping(path = "api/v1/calificaciones")
public class calificacionesController {

    private final CalificacionesServices calificacionesServices;

    public calificacionesController(CalificacionesServices calificacionesServices) {
        this.calificacionesServices = calificacionesServices;
    }
    @PostMapping
    public void agregarcali(calificaciones calificaciones){
        this.calificacionesServices.agregarCali(calificaciones);
    }
    @DeleteMapping("/{id}")
    public void eliminarCali(@PathVariable int id){
        calificacionesServices.eliminar(id);
    }
    @PutMapping("/{id}")
    public calificaciones editarCali(@PathVariable calificaciones caliicaciones){
        return calificacionesServices.editar(caliicaciones);
    }


}
