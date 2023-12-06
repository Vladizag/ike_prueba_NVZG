package ikeaprueba01.prueba01.model;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Table
@Entity
public class calificaciones{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public int matricula;
    public int id_subject;
    public int cali;

    public calificaciones() {
    }

    public calificaciones(int id, int matricula, int id_subject, int cali) {
        this.id = id;
        this.matricula = matricula;
        this.id_subject = id_subject;
        this.cali = cali;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getId_subject() {
        return id_subject;
    }

    public void setId_subject(int id_subject) {
        this.id_subject = id_subject;
    }

    public int getCali() {
        return cali;
    }

    public void setCali(int cali) {
        this.cali = cali;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
