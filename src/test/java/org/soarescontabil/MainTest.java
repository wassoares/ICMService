package org.soarescontabil;

import org.soarescontabil.model.SelecaoDeAliquota;
import org.soarescontabil.model.Uf;

public class MainTest {

	public static void main(String[] args) {
		//realizar vários testes para cobrir as opções do mapa de aliquotas internas do ICMS... 
		SelecaoDeAliquota selecao = new SelecaoDeAliquota(Uf.valueOf("PB"), Uf.valueOf("RN"));		
		System.out.println("Aliquota: " + selecao.getAliquota());		
		
	}

}
