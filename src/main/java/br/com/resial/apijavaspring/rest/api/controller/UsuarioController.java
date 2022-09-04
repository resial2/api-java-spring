package br.com.resial.apijavaspring.rest.api.controller;

import br.com.resial.apijavaspring.rest.api.model.UsuarioModel;
import br.com.resial.apijavaspring.rest.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping(path = "/api/usuario/{id}")
    public ResponseEntity<UsuarioModel> consultarUsuario(@PathVariable("id") Integer id) {
        return repository.findById(id)
                .map(usuarioModel -> ResponseEntity.ok().body(usuarioModel))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/api/usuario/cadastro")
    public UsuarioModel cadastrarUsuario(@RequestBody UsuarioModel usuarioModel) {
        return repository.save(usuarioModel);
    }

}
