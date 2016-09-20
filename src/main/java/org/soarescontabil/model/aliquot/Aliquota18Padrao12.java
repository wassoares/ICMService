package org.soarescontabil.model.aliquot;

import org.soarescontabil.model.Aliquota;
import org.soarescontabil.model.Uf;

public class Aliquota18Padrao12 implements Aliquota {

	@Override
	public double getPorcentagem(Uf origem, Uf destino) {
		if (origem.equals(destino)) {
			return 18;
		} else if (destino.equals(Uf.EX)) {
			return 4;
		}
		return 12;
	}
	
}
