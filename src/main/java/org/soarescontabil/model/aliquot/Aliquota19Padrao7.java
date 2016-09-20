package org.soarescontabil.model.aliquot;

import org.soarescontabil.model.Aliquota;
import org.soarescontabil.model.Uf;

public class Aliquota19Padrao7 implements Aliquota {

	@Override
	public double getPorcentagem(Uf origem, Uf destino) {
		if (origem.equals(destino)) {
			return 19;
		} else if (destino.equals(Uf.EX)) {
			return 4;
		} else if (destino.equals(Uf.MG) || destino.equals(Uf.PR) || destino.equals(Uf.RS) || destino.equals(Uf.RJ) || destino.equals(Uf.SC) || destino.equals(Uf.SP)) {
			return 12; 
		}
		return 7;
	}

}
