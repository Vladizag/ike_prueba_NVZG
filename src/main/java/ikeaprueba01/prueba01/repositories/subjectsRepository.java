package ikeaprueba01.prueba01.repositories;

import ikeaprueba01.prueba01.model.Subjects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface subjectsRepository extends JpaRepository<Subjects,Integer> {
}
