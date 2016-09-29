package org.soarescontabil.icmservice.model;

public class AliquotaInterEstadual {
	
	public static double selecionar(String origem, String destino) {
		return Uf.valueOf(origem).obterAliquota().getPorcentagem(Uf.valueOf(origem), Uf.valueOf(destino));
	}
	
}
