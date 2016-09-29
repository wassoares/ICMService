package org.soarescontabil.icmservice.controller;

import org.soarescontabil.icmservice.model.AntecipacaoEntradas;
import org.soarescontabil.icmservice.service.AntecipacaoEntradasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AntecipacaoEntradasController {

	@Autowired
	AntecipacaoEntradasService aeService;

	@RequestMapping(method = RequestMethod.POST, value = "/antecipacao", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AntecipacaoEntradas> calculate(@RequestBody AntecipacaoEntradas ae) {
		AntecipacaoEntradas aeCalculado = aeService.calculate(ae);
		return new ResponseEntity<>(aeCalculado, HttpStatus.OK);
	}

}
