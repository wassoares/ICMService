package org.soarescontabil.model.aliquot;

import org.soarescontabil.model.Aliquota;
import org.soarescontabil.model.Uf;

public class Aliquota18Padrao7 implements Aliquota {

	@Override
	public double getValorOrigem() {
		return 18;
	}

	@Override
	public double getValorDestino(Uf uf) {
		if (uf.equals(Uf.EX)) {
			return 4;
		} else if (uf.equals(Uf.MG) || uf.equals(Uf.PR) || uf.equals(Uf.RS) || uf.equals(Uf.RJ) || uf.equals(Uf.SC) || uf.equals(Uf.SP)) {
			return 12;
		} else {
			return 7;
		}

	}
	
	@Override
	public double getPorcentagem(Uf origem, Uf destino) {
		if (origem.equals(destino)) {
			return 18;
		} else if (destino.equals(Uf.EX)) {
			return 4;
		} else if (destino.equals(Uf.MG) || destino.equals(Uf.PR) || destino.equals(Uf.RS) || destino.equals(Uf.RJ) || destino.equals(Uf.SC) || destino.equals(Uf.SP)) {
			return 12; 
		}
		return 7;
	}

}
