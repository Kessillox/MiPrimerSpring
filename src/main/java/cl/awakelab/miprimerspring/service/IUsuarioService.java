package cl.awakelab.miprimerspring.service;

import cl.awakelab.miprimerspring.entity.Usuario;

import java.util.List;

public interface IUsuarioService {
    List<Usuario> listarUsuarios ();
    Usuario crearUsuario(Usuario usuario);
    Usuario buscarUsuarioPorId(int idUsuario);
    Usuario actualizarUsuario(Usuario usuario);
    void eliminarUsuario(Usuario usuario);
}
