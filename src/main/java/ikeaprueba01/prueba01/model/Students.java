package ikeaprueba01.prueba01.model;

import jakarta.persistence.*;

@Entity
@Table
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int matricula;
    public String nombre;
    public String apellidopa;
    public String apellidoMa;
    public int materia;


    public Students() {
    }

    public Students(int matricula, String nombre, String apellidopa, String apellidoMa, int materia) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellidopa = apellidopa;
        this.apellidoMa = apellidoMa;
        this.materia = materia;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidopa() {
        return apellidopa;
    }

    public void setApellidopa(String apellidopa) {
        this.apellidopa = apellidopa;
    }

    public String getApellidoMa() {
        return apellidoMa;
    }

    public void setApellidoMa(String apellidoMa) {
        this.apellidoMa = apellidoMa;
    }

    public int getMateria() {
        return materia;
    }

    public void setMateria(int materia) {
        this.materia = materia;
    }
}
