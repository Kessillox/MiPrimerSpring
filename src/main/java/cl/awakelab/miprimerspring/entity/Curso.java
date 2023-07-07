package cl.awakelab.miprimerspring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "Cursos")
public class Curso {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCurso;
    @Column
    private String nombre;
    @OneToMany(mappedBy = "curso")
    private List<Alumno> listaAlumnos;
    @ManyToMany(mappedBy = "listaCursos")
    private List<Profesor> listaProfesores;

}
