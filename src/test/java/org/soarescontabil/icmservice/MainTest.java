package org.soarescontabil.icmservice;

import org.soarescontabil.icmservice.model.SelecaoDeAliquota;
import org.soarescontabil.icmservice.model.Uf;

public class MainTest {

	public static void main(String[] args) {
		//realizar vários testes para cobrir as opções do mapa de aliquotas internas do ICMS... 
		SelecaoDeAliquota selecao = new SelecaoDeAliquota(Uf.valueOf("PB"), Uf.valueOf("RN"));		
		System.out.println("Aliquota: " + selecao.getAliquota());		
		
	}

}
