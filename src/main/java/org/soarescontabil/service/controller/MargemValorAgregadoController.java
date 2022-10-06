package org.soarescontabil.service.controller;

import java.util.Collection;

import org.soarescontabil.service.model.MargemValorAgregado;
import org.soarescontabil.service.service.MargemValorAgregadoService;
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
@RequestMapping//("/admin")
public class MargemValorAgregadoController {

	@Autowired
	MargemValorAgregadoService margemService;

	@RequestMapping(method = RequestMethod.POST, value = "/margens", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<MargemValorAgregado> save(@RequestBody MargemValorAgregado margem) {
		MargemValorAgregado margemSalva = margemService.salvar(margem);
		return new ResponseEntity<>(margemSalva, HttpStatus.CREATED);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/margens", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<MargemValorAgregado>> findAll() {
		Collection<MargemValorAgregado> margensEncontradas = margemService.buscarTodos();
		return new ResponseEntity<>(margensEncontradas, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/margens/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<MargemValorAgregado> findById(@PathVariable Integer id) {
		MargemValorAgregado margemEncontrada = margemService.buscarPorId(id);
		return new ResponseEntity<>(margemEncontrada, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/margens/{id}")
	public ResponseEntity<MargemValorAgregado> remove(@PathVariable Integer id) {
		MargemValorAgregado margemEncontrada = margemService.buscarPorId(id);		
		if (margemEncontrada == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		margemService.excluir(margemEncontrada);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/margens", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<MargemValorAgregado> update(@RequestBody MargemValorAgregado margem) {
		if (margemService.buscarPorId(margem.getId()) == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		MargemValorAgregado margemAlterada = margemService.alterar(margem);
		return new ResponseEntity<>(margemAlterada, HttpStatus.OK);
	}
}
