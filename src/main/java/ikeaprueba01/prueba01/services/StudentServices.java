package ikeaprueba01.prueba01.services;

import ikeaprueba01.prueba01.repositories.studentsRepository;
import org.springframework.stereotype.Service;
import ikeaprueba01.prueba01.model.Students;

import java.util.List;

@Service
public class StudentServices {

    private final studentsRepository studentsRepository;

    public StudentServices(ikeaprueba01.prueba01.repositories.studentsRepository studentsRepository) {
        this.studentsRepository = studentsRepository;
    }
    public List<Students> getStudents(){
        return this.studentsRepository.findAll();
    }

    public void newStudent(Students students){
        studentsRepository.save(students);
    }
}
