package org.soarescontabil.service.service;

import org.soarescontabil.service.model.SubstituicaoTributaria;
import org.springframework.stereotype.Service;

@Service
public class SubstituicaoTributariaService extends ImpostoService {

	public SubstituicaoTributaria calculate(SubstituicaoTributaria st) {
		SubstituicaoTributaria substituicao = new SubstituicaoTributaria(load(st), st.getAgregacao());
		substituicao.calcular();
		return substituicao;
	}

}
