package ikeaprueba01.prueba01.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ikeaprueba01.prueba01.model.Students;
import ikeaprueba01.prueba01.services.StudentServices;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
public class studentController {

    private final StudentServices studentServices;

    public studentController(StudentServices studentServices) {
        this.studentServices = studentServices;
    }

    @GetMapping
    public List<Students> getStudents(){
        return this.studentServices.getStudents();
    }

    @PostMapping
    public void newStudent(Students students){
        this.studentServices.newStudent(students);
    }
}
