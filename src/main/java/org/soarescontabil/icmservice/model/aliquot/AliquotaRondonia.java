package org.soarescontabil.icmservice.model.aliquot;

import org.soarescontabil.icmservice.model.Aliquota;
import org.soarescontabil.icmservice.model.Uf;

public class AliquotaRondonia implements Aliquota {

	@Override
	public double getPorcentagem(Uf origem, Uf destino) {
		if (origem.equals(destino)) {
			return 17,5;
		} else if (destino.equals(Uf.IM)) {
			return 4;
		}
		return 12;
	}	

}
