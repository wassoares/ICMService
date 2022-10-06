package org.soarescontabil.service.model.aliquot;

import org.soarescontabil.service.model.Aliquota;
import org.soarescontabil.service.model.Uf;

public class AliquotaRioDeJaneiro implements Aliquota {

	@Override
	public double getPorcentagem(Uf origem, Uf destino) {
		if (origem.equals(destino)) {
			return 20;
		} else if (destino.equals(Uf.IM)) {
			return 4;
		} else if (destino.equals(Uf.MG) 
				|| destino.equals(Uf.PR) 
				|| destino.equals(Uf.RS) 
				|| destino.equals(Uf.SC) 
				|| destino.equals(Uf.SP)) {
			return 12; 
		}
		return 7;
	}

}
