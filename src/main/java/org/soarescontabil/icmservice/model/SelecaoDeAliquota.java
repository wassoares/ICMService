package org.soarescontabil.icmservice.model;

public class SelecaoDeAliquota {
	
	private double aliquota;

	public SelecaoDeAliquota(Uf origem, Uf destino) {
		this.aliquota = origem.obterAliquota().getPorcentagem(origem, destino);
	}

	public double getAliquota() {
		return aliquota;
	}
	
}
