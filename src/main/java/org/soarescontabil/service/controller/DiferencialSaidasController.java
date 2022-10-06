package org.soarescontabil.service.controller;

import org.soarescontabil.service.model.DiferencialSaidas;
import org.soarescontabil.service.services.DiferencialSaidasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiferencialSaidasController {

	@Autowired
	DiferencialSaidasService dsService;

	@RequestMapping(method = RequestMethod.POST, value = "/diferencial", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<DiferencialSaidas> calculate(@RequestBody DiferencialSaidas ds) {
		DiferencialSaidas dsCalculado = dsService.calculate(ds);
		return new ResponseEntity<>(dsCalculado, HttpStatus.OK);
	}

}
