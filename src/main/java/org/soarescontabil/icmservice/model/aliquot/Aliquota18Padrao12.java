package org.soarescontabil.icmservice.model.aliquot;

import org.soarescontabil.icmservice.model.Aliquota;
import org.soarescontabil.icmservice.model.Uf;

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
