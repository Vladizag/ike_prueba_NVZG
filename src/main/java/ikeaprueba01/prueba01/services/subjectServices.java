package ikeaprueba01.prueba01.services;

import ikeaprueba01.prueba01.model.Subjects;
import ikeaprueba01.prueba01.repositories.subjectsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class subjectServices {

    private final subjectsRepository subjectRepository;

    public subjectServices(subjectsRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    public List<Subjects> getSubjcts(){
        return this.subjectRepository.findAll();
    }

    public void newSubject(Subjects subjects){
        subjectRepository.save(subjects);

    }
}
