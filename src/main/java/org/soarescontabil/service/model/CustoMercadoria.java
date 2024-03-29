package org.soarescontabil.service.model;

public class CustoMercadoria {

	private double valor;
	private String ufOrigem;
	private String ufDestino;
	private double credito;

	public CustoMercadoria() {
	}

	public CustoMercadoria(double valor, String ufOrigem, String ufDestino, double credito) {
		setValor(valor);
		setUfOrigem(ufOrigem);
		setUfDestino(ufDestino);
		setCredito(credito);
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getUfOrigem() {
		return ufOrigem;
	}

	public void setUfOrigem(String ufOrigem) {
		this.ufOrigem = ufOrigem;
	}

	public String getUfDestino() {
		return ufDestino;
	}

	public void setUfDestino(String ufDestino) {
		this.ufDestino = ufDestino;
	}

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}

}
