package cl.awakelab.miprimerspring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "Alumnos")
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAlumno;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String direccion;
    private LocalDate fechaNacimiento;

    @ManyToOne
    @JoinColumn(name = "idCurso")
    private Curso curso;
}
