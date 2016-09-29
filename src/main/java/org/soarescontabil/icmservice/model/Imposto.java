package org.soarescontabil.icmservice.model;

public abstract class Imposto {

	protected CustoMercadoria custoMercadoria;
	protected double aliquotaInterna;
	protected double aliquotaExterna;
	protected double valor;

	public CustoMercadoria getCustoMercadoria() {
		return custoMercadoria;
	}

	public void setCustoMercadoria(CustoMercadoria custoMercadoria) {
		this.custoMercadoria = custoMercadoria;
	}

	public double getAliquotaInterna() {
		return aliquotaInterna > 0 ? aliquotaInterna
				: AliquotaInterEstadual.selecionar(custoMercadoria.getUfOrigem(), custoMercadoria.getUfOrigem()) / 100;
	}

	public void setAliquotaInterna(double aliquotaInterna) {
		this.aliquotaInterna = aliquotaInterna;
	}

	public double getAliquotaExterna() {
		return aliquotaExterna > 0 ? aliquotaExterna
				: AliquotaInterEstadual.selecionar(custoMercadoria.getUfOrigem(), custoMercadoria.getUfDestino()) / 100;
	}

	public void setAliquotaExterna(double aliquotaExterna) {
		this.aliquotaExterna = aliquotaExterna;
	}

	public double getCreditoDestacado() {
		return custoMercadoria.getCredito() > 0 ? custoMercadoria.getCredito()
				: custoMercadoria.getValor() * getAliquotaExterna();
	}

	public double getValor() {
		return Conversor.arredondar(valor, 2);
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public abstract void calcular();

}
