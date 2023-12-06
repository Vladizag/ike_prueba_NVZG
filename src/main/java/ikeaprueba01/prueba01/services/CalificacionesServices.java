package ikeaprueba01.prueba01.services;

import org.springframework.stereotype.Service;
import ikeaprueba01.prueba01.repositories.calificacionRepository;
import ikeaprueba01.prueba01.model.calificaciones;

@Service
public class CalificacionesServices {

    private final calificacionRepository calificacionesRepository;

    public CalificacionesServices(calificacionRepository calificacionesRepository) {
        this.calificacionesRepository = calificacionesRepository;
    }

    public void agregarCali(calificaciones calificaciones ){
        calificacionesRepository.save(calificaciones);
    }

    public void eliminar(int calificaciones){
        calificacionesRepository.deleteById(calificaciones);
    }

    public calificaciones editar(calificaciones calificaciones){
        return calificacionesRepository.save(calificaciones);
    }



}
