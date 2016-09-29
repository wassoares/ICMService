package org.soarescontabil.icmservice.service;

import org.soarescontabil.icmservice.model.CustoMercadoria;
import org.soarescontabil.icmservice.model.Imposto;

public abstract class ImpostoService {

	protected CustoMercadoria load(Imposto imposto) {
		double valor = imposto.getCustoMercadoria().getValor();
		String origem = imposto.getCustoMercadoria().getUfOrigem();
		String destino = imposto.getCustoMercadoria().getUfDestino();
		double credito = imposto.getCustoMercadoria().getCredito();
		return new CustoMercadoria(valor,origem, destino, credito);
	}
	
}
