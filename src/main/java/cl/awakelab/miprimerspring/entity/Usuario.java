package cl.awakelab.miprimerspring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;

    private int rut;

    private String contrasenia;

    private String rol;
}
