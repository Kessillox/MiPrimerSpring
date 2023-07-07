package cl.awakelab.miprimerspring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
@Table(name = "Profesores")
public class Profesor {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProfesor;
    @Column
    private String nombre;
    @Column
    private String apelllido1;
    @Column
    private String apellido2;
    @ManyToMany
    @JoinTable(name = "Curso_Profesor",
                joinColumns = @JoinColumn(name = "FK_Profesor", nullable = false),
                inverseJoinColumns = @JoinColumn(name = "FK_Curso", nullable = false))
    private List<Curso> listaCursos;
}
