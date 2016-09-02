package org.soarescontabil;

import org.soarescontabil.model.Aliquota;
import org.soarescontabil.model.Uf;

public class MainTest {

	public static void main(String[] args) {
		Aliquota aliquota = Uf.PB.obterAliquota();
		System.out.println("Aliquota Origem: " + aliquota.getValorOrigem());
		System.out.println("Aliquota Destino: " + aliquota.getValorDestino(Uf.EX));
	}

}
