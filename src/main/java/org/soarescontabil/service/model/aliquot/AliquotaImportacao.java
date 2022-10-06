package org.soarescontabil.service.model.aliquot;

import org.soarescontabil.service.model.Aliquota;
import org.soarescontabil.service.model.Uf;

public class AliquotaImportacao implements Aliquota {

	@Override
	public double getPorcentagem(Uf origem, Uf destino) {
		return 4;
	}
	
}
