package org.soarescontabil.icmservice.model;

public class SeletorDeAliquota {
	
	public static double selecionar(Uf origem, Uf destino) {
		return origem.obterAliquota().getPorcentagem(origem, destino);
	}
	
}
