package org.soarescontabil.service.model.aliquot;

import org.soarescontabil.service.model.Aliquota;
import org.soarescontabil.service.model.Uf;

public class Aliquota18Padrao12 implements Aliquota {

	@Override
	public double getPorcentagem(Uf origem, Uf destino) {
		if (origem.equals(destino)) {
			return 18;
		} else if (destino.equals(Uf.IM)) {
			return 4;
		}
		return 12;
	}
	
}
