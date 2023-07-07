package cl.awakelab.miprimerspring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Usuarios")
public class Usuario {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    @Column
    private int rut;
    @Column
    private String contrasenia;
    @Column
    private String rol;
}
