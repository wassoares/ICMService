package org.soarescontabil.service.model;

import java.util.Date;

public class Partilha {

	private Date dataInicio;
	private Date dataFinal;
	private double parcelaOrigem;
	private double parcelaDestino;

	public Partilha() {
	}

	public Partilha(Date dataInicial, Date dataFinal, double parcelaOrigem, double parcelaDestino) {
		setDataInicio(dataInicial);
		setDataFinal(dataFinal);
		setParcelaOrigem(parcelaOrigem);
		setParcelaDestino(parcelaDestino);
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}

	public double getParcelaOrigem() {
		return parcelaOrigem;
	}

	public void setParcelaOrigem(double parcelaOrigem) {
		this.parcelaOrigem = parcelaOrigem;
	}

	public double getParcelaDestino() {
		return parcelaDestino;
	}

	public void setParcelaDestino(double parcelaDestino) {
		this.parcelaDestino = parcelaDestino;
	}

}
