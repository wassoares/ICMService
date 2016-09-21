package org.soarescontabil.icmservice.controller;

import java.util.Collection;

import org.soarescontabil.icmservice.model.MargemValorAgregado;
import org.soarescontabil.icmservice.service.MargemValorAgregadoService;
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
public class MargemValorAgregadoController {

	@Autowired
	MargemValorAgregadoService mvaService;

	@RequestMapping(method = RequestMethod.POST, value = "/mva", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<MargemValorAgregado> save(@RequestBody MargemValorAgregado mva) {
		MargemValorAgregado mvaSalvo = mvaService.salvar(mva);
		return new ResponseEntity<>(mvaSalvo, HttpStatus.CREATED);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/mva", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<MargemValorAgregado>> findAll() {
		Collection<MargemValorAgregado> mvaEncontrados = mvaService.buscarTodos();
		return new ResponseEntity<>(mvaEncontrados, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/mva/{id}")
	public ResponseEntity<MargemValorAgregado> remove(@PathVariable Integer id) {
		MargemValorAgregado mvaEncontrado = mvaService.buscarPorId(id);		
		if (mvaEncontrado == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		mvaService.excluir(mvaEncontrado);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/mva", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<MargemValorAgregado> update(@RequestBody MargemValorAgregado mva) {
		if (mvaService.buscarPorId(mva.getId()) == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		MargemValorAgregado mvaAlterado = mvaService.alterar(mva);
		return new ResponseEntity<>(mvaAlterado, HttpStatus.OK);
	}
}
