package org.soarescontabil.model;

public interface Aliquota {
	
	public double getValorOrigem();
	
	public double getValorDestino(Uf uf);
	
	public double getPorcentagem(Uf origem, Uf destino);

}
