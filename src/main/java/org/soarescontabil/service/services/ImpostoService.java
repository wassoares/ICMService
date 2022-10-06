package org.soarescontabil.service.services;

import org.soarescontabil.service.model.CustoMercadoria;
import org.soarescontabil.service.model.Imposto;

public abstract class ImpostoService {

	protected CustoMercadoria load(Imposto imposto) {
		double valor = imposto.getCustoMercadoria().getValor();
		String origem = imposto.getCustoMercadoria().getUfOrigem();
		String destino = imposto.getCustoMercadoria().getUfDestino();
		double credito = imposto.getCustoMercadoria().getCredito();
		return new CustoMercadoria(valor,origem, destino, credito);
	}
	
}
