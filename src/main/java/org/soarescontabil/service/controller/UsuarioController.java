package org.soarescontabil.service.controller;

import java.util.Collection;

import org.soarescontabil.service.model.Usuario;
import org.soarescontabil.service.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@RequestMapping(value="/usuarios", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Usuario> save(@RequestBody Usuario usuario) {
		Usuario usuarioSalvo = usuarioService.salvar(usuario);
		return new ResponseEntity<>(usuarioSalvo, HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/usuarios", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<Usuario>> findAll() {
		Collection<Usuario> usuariosEncontrados = usuarioService.buscarTodos();
		return new ResponseEntity<>(usuariosEncontrados, HttpStatus.OK);
	}
	
	//método não utilizado! verificar necessidade de mantê-lo...
	@RequestMapping(method = RequestMethod.GET, value = "/usuarios/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Usuario> findById(@PathVariable Integer id) {
		Usuario usuarioEncontrado = usuarioService.buscarPorId(id);
		return new ResponseEntity<>(usuarioEncontrado, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/usuarios/{id}")
	public ResponseEntity<Usuario> remove(@PathVariable Integer id) {
		Usuario usuarioEncontrado = usuarioService.buscarPorId(id);		
		if (usuarioEncontrado == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		usuarioService.excluir(usuarioEncontrado);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	//método não utilizado! verificar necessidade de mantê-lo...
	@RequestMapping(method = RequestMethod.PUT, value = "/usuarios", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Usuario> update(@RequestBody Usuario usuario) {
		if (usuarioService.buscarPorId(usuario.getId()) == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		Usuario usuarioAlterado = usuarioService.alterar(usuario);
		return new ResponseEntity<>(usuarioAlterado, HttpStatus.OK);
	}
	
}
