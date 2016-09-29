package org.soarescontabil.icmservice.model;

public class AntecipacaoEntradas extends Imposto {

	public AntecipacaoEntradas() {
	}

	public AntecipacaoEntradas(CustoMercadoria custoMercadoria) {
		setCustoMercadoria(custoMercadoria);
	}

	@Override
	public void calcular() {
		valor = custoMercadoria.getValor() - getCreditoDestacado();
		valor = valor / (1 - getAliquotaInterna());
		valor = valor * getAliquotaInterna();
		valor = valor - getCreditoDestacado();
	}

}
