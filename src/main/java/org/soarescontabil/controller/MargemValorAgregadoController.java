package org.soarescontabil.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.soarescontabil.model.MargemValorAgregado;
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

	private Map<Integer, MargemValorAgregado> repositorio;
	Integer indice;

	public MargemValorAgregadoController() {
		this.repositorio = new HashMap<>();
		this.indice = repositorio.size() + 1;
	}

	private MargemValorAgregado salvar(MargemValorAgregado mva) {
		mva.setId(this.indice++);
		repositorio.put(mva.getId(), mva);
		System.out.println("registrados:" + repositorio.size());
		return mva;
	}

	private Collection<MargemValorAgregado> buscarTodos() {
		return repositorio.values();
	}
	
	private MargemValorAgregado buscarPorId(Integer id) {
		return repositorio.get(id);
	}
	
	private void excluir(MargemValorAgregado mva) {
		repositorio.remove(mva.getId());
	}
	
	private MargemValorAgregado alterar(MargemValorAgregado mva) {
		repositorio.put(mva.getId(), mva);
		return mva;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/mva", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<MargemValorAgregado> save(@RequestBody MargemValorAgregado mva) {
		MargemValorAgregado mvaSalvo = salvar(mva);
		return new ResponseEntity<>(mvaSalvo, HttpStatus.CREATED);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/mva", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<MargemValorAgregado>> findAll() {
		Collection<MargemValorAgregado> mvaEncontrados = buscarTodos();
		return new ResponseEntity<>(mvaEncontrados, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/mva/{id}")
	public ResponseEntity<MargemValorAgregado> remove(@PathVariable Integer id) {
		MargemValorAgregado mvaEncontrado = buscarPorId(id);		
		if (mvaEncontrado == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		excluir(mvaEncontrado);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/mva", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<MargemValorAgregado> update(@RequestBody MargemValorAgregado mva) {
		if (buscarPorId(mva.getId()) == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		MargemValorAgregado mvaAlterado = alterar(mva);
		return new ResponseEntity<>(mvaAlterado, HttpStatus.OK);
	}
}
