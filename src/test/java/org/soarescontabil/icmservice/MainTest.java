package org.soarescontabil.icmservice;

import org.soarescontabil.icmservice.model.CustoMercadoria;
import org.soarescontabil.icmservice.model.DiferencialDeAliquota;
import org.soarescontabil.icmservice.model.SeletorDeAliquota;
import org.soarescontabil.icmservice.model.SubstituicaoTributaria;
import org.soarescontabil.icmservice.model.Uf;

public class MainTest {

	public static void main(String[] args) {
		//realizar vários testes para cobrir as opções do mapa de aliquotas internas do ICMS... 
		System.out.println("Aliquota: " + SeletorDeAliquota.selecionar(Uf.valueOf("PB"), Uf.valueOf("RN")));
		
		//teste substituição tributária...
		CustoMercadoria cmst = new CustoMercadoria();
		cmst.setValor(190);
		cmst.setUfOrigem("PB");
		cmst.setUfDestino("RN");
		cmst.setCredito(0);
		
		SubstituicaoTributaria st = new SubstituicaoTributaria();
		st.setCustoMercadoria(cmst);
		st.setAgregacao(71.78);
		st.calcular();
		
		System.out.println("Base de Cálculo: " + st.getBaseDeCalculo());
		System.out.println("Valor do Imposto: " + st.getValor());
		
		//teste diferencial de aliquota...
		CustoMercadoria cm = new CustoMercadoria();
		cm.setValor(1000);
		cm.setUfOrigem("BA");
		cm.setUfDestino("SP");
		cm.setCredito(0);
		
		DiferencialDeAliquota df = new DiferencialDeAliquota();
		df.setCustoMercadoria(cm);
		df.calcular();
		
		System.out.println("Imposto Destacado: " + df.getCredito());
		System.out.println("Aliquota Interna: " + df.getAliquotaInterna());
		System.out.println("Aliquota Externa: " + df.getAliquotaExterna());
		System.out.println("Valor do Imposto: " + df.getValor());
	}

}
