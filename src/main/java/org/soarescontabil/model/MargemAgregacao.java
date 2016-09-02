package org.soarescontabil.model;

public class MargemAgregacao {

	private int id;
	private String atividade;
	private Double aliquota;

	public int getId() {
		return id;
	}

	public String getAtividade() {
		return atividade;
	}

	public void setAtividade(String atividade) {
		this.atividade = atividade;
	}

	public Double getAliquota() {
		return aliquota;
	}

	public void setAliquota(Double aliquota) {
		this.aliquota = aliquota;
	}

}
