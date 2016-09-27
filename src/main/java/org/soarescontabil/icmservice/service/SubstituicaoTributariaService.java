package org.soarescontabil.icmservice.service;

import org.soarescontabil.icmservice.model.CustoMercadoria;
import org.soarescontabil.icmservice.model.SubstituicaoTributaria;
import org.springframework.stereotype.Service;

@Service
public class SubstituicaoTributariaService {
	
	public SubstituicaoTributaria calculate(SubstituicaoTributaria st) {
		
		CustoMercadoria cm = new CustoMercadoria();
		cm.setValor(st.getCustoMercadoria().getValor());
		cm.setUfOrigem(st.getCustoMercadoria().getUfOrigem());
		cm.setUfDestino(st.getCustoMercadoria().getUfDestino());
		cm.setCredito(st.getCustoMercadoria().getCredito());
		
		SubstituicaoTributaria imposto = new SubstituicaoTributaria();
		imposto.setCustoMercadoria(cm);
		imposto.setAgregacao(st.getAgregacao());
		imposto.calcular();
		
		return imposto;
	}
}
