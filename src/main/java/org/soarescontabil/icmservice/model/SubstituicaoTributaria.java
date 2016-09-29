package org.soarescontabil.icmservice.model;

public class SubstituicaoTributaria extends Imposto {

	private double baseDeCalculo;
	private double agregacao;

	public SubstituicaoTributaria() {
	}

	public SubstituicaoTributaria(CustoMercadoria custoMercadoria, double agregacao) {
		setCustoMercadoria(custoMercadoria);
		setAgregacao(agregacao);
	}

	public double getBaseDeCalculo() {
		return Conversor.arredondar(baseDeCalculo, 2);
	}

	public void setBaseDeCalculo(double baseDeCalculo) {
		this.baseDeCalculo = baseDeCalculo;
	}

	public double getAgregacao() {
		return agregacao;
	}

	public void setAgregacao(double agregacao) {
		this.agregacao = agregacao;
	}

	@Override
	public void calcular() {
		baseDeCalculo = (custoMercadoria.getValor() * agregacao / 100) + custoMercadoria.getValor();
		valor = (baseDeCalculo * getAliquotaInterna()) - getCreditoDestacado();
	}

}
