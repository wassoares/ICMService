package org.soarescontabil.model;

public class MargemValorAgregado {

	private Integer id;
	private String atividade;
	private Double aliquota;

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
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
