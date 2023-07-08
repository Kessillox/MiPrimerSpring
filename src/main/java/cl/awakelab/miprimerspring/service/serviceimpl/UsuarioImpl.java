package cl.awakelab.miprimerspring.service.serviceimpl;

import cl.awakelab.miprimerspring.entity.Usuario;
import cl.awakelab.miprimerspring.repository.IUsuarioRepository;
import cl.awakelab.miprimerspring.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service("usuarioImpl")
public class UsuarioImpl implements IUsuarioService {

    @Autowired //inyeccion de repositorio
    IUsuarioRepository objUsuarioRepo;
    @Override
    public Usuario crearUsuario(Usuario usuario) {
        return objUsuarioRepo.save(usuario);
    }
    @Override
    public List<Usuario> listarUsuarios() {
        return objUsuarioRepo.findAll();
    }
    @Override
    public Usuario buscarUsuarioPorId(int idUsuario) {
        return objUsuarioRepo.findById(idUsuario).orElseThrow(() -> new NoSuchElementException("Usuario no encontrado"));
    }
    @Override
    public Usuario actualizarUsuario(Usuario usuarioActualizar, int idUsuario) {
        Usuario usuario = objUsuarioRepo.findById(idUsuario).orElseThrow(()->new NoSuchElementException("Usuario no encontrado"));
        usuario.setRut(usuarioActualizar.getRut());
        usuario.setContrasenia(usuarioActualizar.getContrasenia());
        usuario.setRol(usuarioActualizar.getRol());
        return objUsuarioRepo.save(usuario);
    }
    @Override
    public Usuario actualizarUsuario2(Usuario usuarioActualizar) {
        Usuario usuario = objUsuarioRepo.findById(usuarioActualizar.getIdUsuario()).orElseThrow(()->new NoSuchElementException("Usuario no encontrado"));
        usuario.setRut(usuarioActualizar.getRut());
        usuario.setContrasenia(usuarioActualizar.getContrasenia());
        usuario.setRol(usuarioActualizar.getRol());
        return objUsuarioRepo.save(usuario);
    }
    @Override
    public void eliminarUsuario(Usuario usuario) {
        objUsuarioRepo.delete(usuario);
    }
}
