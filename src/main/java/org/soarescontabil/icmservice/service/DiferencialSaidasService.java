package org.soarescontabil.icmservice.service;

import org.soarescontabil.icmservice.model.DiferencialSaidas;
import org.springframework.stereotype.Service;

@Service
public class DiferencialSaidasService extends ImpostoService {

	public DiferencialSaidas calculate(DiferencialSaidas ds) {
		DiferencialSaidas diferencial = new DiferencialSaidas(load(ds), ds.getDataCalculo(), ds.getRotinaFuncep());
		diferencial.calcular();
		return diferencial;
	}
}
