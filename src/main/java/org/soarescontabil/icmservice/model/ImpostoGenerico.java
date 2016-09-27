package org.soarescontabil.icmservice.model;

public abstract class ImpostoGenerico {

	protected CustoMercadoria custoMercadoria;
	protected double aliquotaInterna;
	protected double aliquotaExterna;
	protected double baseDeCalculo;
	protected double valor;

	public void setCustoMercadoria(CustoMercadoria custoMercadoria) {
		this.custoMercadoria = custoMercadoria;
	}

	public CustoMercadoria getCustoMercadoria() {
		return custoMercadoria;
	}

	public void setAliquotaInterna(double aliquotaInterna) {
		this.aliquotaInterna = aliquotaInterna;
	}

	public double getAliquotaInterna() {
		return aliquotaInterna > 0 ? aliquotaInterna
				: SeletorDeAliquota.selecionar(Uf.valueOf(custoMercadoria.getUfOrigem()),
						Uf.valueOf(custoMercadoria.getUfOrigem()));
	}

	public void setAliquotaExterna(double aliquotaExterna) {
		this.aliquotaExterna = aliquotaExterna;
	}

	public double getAliquotaExterna() {
		return aliquotaExterna > 0 ? aliquotaExterna
				: SeletorDeAliquota.selecionar(Uf.valueOf(custoMercadoria.getUfOrigem()),
						Uf.valueOf(custoMercadoria.getUfDestino()));
	}

	public void setBaseDeCalculo(double baseDeCalculo) {
		this.baseDeCalculo = baseDeCalculo;
	}

	public double getBaseDeCalculo() {
		return Importancia.arredondar(baseDeCalculo, 2);
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return Importancia.arredondar(valor, 2);
	}

	public double getCredito() {
		return custoMercadoria.getCredito() > 0 ? custoMercadoria.getCredito()
				: custoMercadoria.getValor() * getAliquotaExterna() / 100;
	}

	public abstract void calcular();

}
