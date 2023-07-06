package cl.awakelab.miprimerspring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
@Table(name = "Profesores")
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProfesor;
    private String nombre;
    private String apelllido1;
    private String apellido2;
    @ManyToMany
    @JoinTable(name = "Curso_Profesor",
            joinColumns = @JoinColumn(name = "idProfesor"),
            inverseJoinColumns = @JoinColumn(name = "idCurso"))
    private List<Curso> listaCursos;
}
