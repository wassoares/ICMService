package org.soarescontabil.icmservice.controller;

import org.soarescontabil.icmservice.model.SubstituicaoTributaria;
import org.soarescontabil.icmservice.service.SubstituicaoTributariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubstituicaoTributariaController {

	@Autowired
	SubstituicaoTributariaService stService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/substituicao", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<SubstituicaoTributaria> calculate(@RequestBody SubstituicaoTributaria st) {
		SubstituicaoTributaria stCalculado = stService.calculate(st);
		return new ResponseEntity<>(stCalculado, HttpStatus.OK);
	}
	
}
