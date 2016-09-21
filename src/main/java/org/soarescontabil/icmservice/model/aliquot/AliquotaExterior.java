package org.soarescontabil.icmservice.model.aliquot;

import org.soarescontabil.icmservice.model.Aliquota;
import org.soarescontabil.icmservice.model.Uf;

public class AliquotaExterior implements Aliquota {

	@Override
	public double getPorcentagem(Uf origem, Uf destino) {
		return 4;
	}
	
}
