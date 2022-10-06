package org.soarescontabil.service.model;

public class DiferencialSaidas extends Imposto {

	private String dataCalculo;
	private String rotinaFuncep;
	private double aliquotaFuncep;
	private double valorFuncep;

	public DiferencialSaidas() {
	}

	public DiferencialSaidas(CustoMercadoria custoMercadoria, String dataCalculo, String rotinaFuncep) {
		setCustoMercadoria(custoMercadoria);
		setDataCalculo(dataCalculo);
		setRotinaFuncep(rotinaFuncep);
	}

	public String getDataCalculo() {
		return dataCalculo;
	}

	public void setDataCalculo(String dataCalculo) {
		this.dataCalculo = dataCalculo;
	}

	public String getRotinaFuncep() {
		return rotinaFuncep;
	}

	public void setRotinaFuncep(String rotinaFuncep) {
		this.rotinaFuncep = rotinaFuncep;
	}

	public double getAliquotaFuncep() {
		return aliquotaFuncep > 0 ? aliquotaFuncep
				: AliquotaFuncep.selecionar(custoMercadoria.getUfOrigem(), rotinaFuncep);
	}

	public void setAliquotaFuncep(double aliquotaFuncep) {
		this.aliquotaFuncep = aliquotaFuncep;
	}

	public double getValorFuncep() {
		return valorFuncep;
	}

	public void setValorFuncep(double valorFuncep) {
		this.valorFuncep = valorFuncep;
	}

	public double getPartilhaOrigem() {
		return Conversor.arredondar(valor * PartilhaInterEstadual.selecionar(dataCalculo).getParcelaOrigem(), 2);
	}

	public double getPartilhaDestino() {
		return Conversor.arredondar(valor * PartilhaInterEstadual.selecionar(dataCalculo).getParcelaDestino(), 2);
	}

	@Override
	public void calcular() {
		double baseDeCalculo = custoMercadoria.getValor() - getCreditoDestacado();
		baseDeCalculo = baseDeCalculo / (1 - (getAliquotaInterna() + getAliquotaFuncep()));
		valor = baseDeCalculo * (getAliquotaInterna() + getAliquotaFuncep());
		valor = valor - getCreditoDestacado();
		valorFuncep = baseDeCalculo * getAliquotaFuncep();
		valor = valor - valorFuncep;
	}

}
