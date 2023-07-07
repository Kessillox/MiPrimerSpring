package cl.awakelab.miprimerspring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "Alumnos")
public class Alumno {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAlumno;
    @Column
    private String nombre;
    @Column
    private String apellido1;
    @Column
    private String apellido2;
    @Column
    private String direccion;
    @Column
    private LocalDate fechaNacimiento;
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "FK_Curso", nullable = false)
    private Curso curso;
}
