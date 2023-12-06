package ikeaprueba01.prueba01.controller;

import ikeaprueba01.prueba01.model.Subjects;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ikeaprueba01.prueba01.services.subjectServices;

import java.util.List;


@RestController
@RequestMapping(path = "/api/v1/subjects")
public class subjectController {

    private final subjectServices subjectServices;

    public subjectController(ikeaprueba01.prueba01.services.subjectServices subjectServices) {
        this.subjectServices = subjectServices;
    }

    @GetMapping
    public List<Subjects> getSubjects(){
        return this.subjectServices.getSubjcts();
    }

    @PostMapping
    public void registrarMateria(Subjects subjects){
        this.subjectServices.newSubject(subjects);

    }
}
