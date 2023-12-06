package ikeaprueba01.prueba01.model;

import jakarta.persistence.*;

@Entity
@Table
public class Subjects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id_subject;
    public String nombre;

    public Subjects() {
    }
    public int getId_subject() {
        return id_subject;
    }

    public void setId_subject(int id_subject) {
        this.id_subject = id_subject;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
