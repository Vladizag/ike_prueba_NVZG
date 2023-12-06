package ikeaprueba01.prueba01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ikeaprueba01.prueba01.model.calificaciones;

@Repository
public interface calificacionRepository extends JpaRepository<calificaciones,Integer> {
}
