package cl.awakelab.miprimerspring.restcontroller;

import cl.awakelab.miprimerspring.entity.Usuario;
import cl.awakelab.miprimerspring.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/usuario")
public class UsuarioRestController {

    @Autowired
    IUsuarioService objUsuarioService;
    @PostMapping// tipo de request //enviar informacion
    public Usuario crearUsuario(@RequestBody Usuario usuario){
        return objUsuarioService.crearUsuario(usuario);
    }
    @GetMapping("/{idUsuario}") //traer informacion
    public Usuario buscarUsuarioPorId(@PathVariable int idUsuario){
        return objUsuarioService.buscarUsuarioPorId(idUsuario);
    }
    @GetMapping
    public List<Usuario> listarUsuarios(){
        return objUsuarioService.listarUsuarios();
    }
    @PutMapping("/{idUsuario}")
    public Usuario actualizarUsuario(@RequestBody Usuario usuarioActualizar, @PathVariable int idUsuario){
        return objUsuarioService.actualizarUsuario(usuarioActualizar,idUsuario);
    }
    @PutMapping //Actualizar
    public Usuario actualizarUsuario2(@RequestBody Usuario usuarioActualizar){
        return objUsuarioService.actualizarUsuario2(usuarioActualizar);
    }
    @DeleteMapping //Eliminar
    public void eliminarUsuario(@RequestBody Usuario usuario){
        objUsuarioService.eliminarUsuario(usuario);
    }

    @DeleteMapping("/{idUsuario}")
    public void eliminarUsuario2(@PathVariable int idUsuario){
        objUsuarioService.eliminarUsuario2(idUsuario);
    }
}
