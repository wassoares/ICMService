package org.soarescontabil.icmservice.model;

public class SubstituicaoTributaria extends ImpostoGenerico {

	private double agregacao;

	public double getAgregacao() {
		return agregacao;
	}

	public void setAgregacao(double agregacao) {
		this.agregacao = agregacao;
	}

	@Override
	public void calcular() {
		baseDeCalculo = (custoMercadoria.getValor() * agregacao / 100) + custoMercadoria.getValor();
		valor = (baseDeCalculo * getAliquotaInterna() / 100) - getCredito();
	}

}
