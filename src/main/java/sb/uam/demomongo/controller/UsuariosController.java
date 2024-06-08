package sb.uam.demomongo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sb.uam.demomongo.documents.Usuarios;
import sb.uam.demomongo.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    public ResponseEntity<?> saveUsuario(@RequestBody Usuarios usuario) {
        try {
            Usuarios usersave =  usuarioRepository.save(usuario);
            return new ResponseEntity<Usuarios>(usersave, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<String>(e.getCause().toString(),
                        HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
