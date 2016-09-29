package org.soarescontabil.icmservice.service;

import org.soarescontabil.icmservice.model.AntecipacaoEntradas;
import org.springframework.stereotype.Service;

@Service
public class AntecipacaoEntradasService extends ImpostoService {

	public AntecipacaoEntradas calculate(AntecipacaoEntradas ae) {
		AntecipacaoEntradas antecipacao = new AntecipacaoEntradas(load(ae));
		antecipacao.calcular();
		return antecipacao;
	}

}
