package org.soarescontabil.service;

import org.soarescontabil.service.model.AliquotaInterEstadual;
import org.soarescontabil.service.model.AntecipacaoEntradas;
import org.soarescontabil.service.model.CustoMercadoria;
import org.soarescontabil.service.model.DiferencialSaidas;
import org.soarescontabil.service.model.SubstituicaoTributaria;

public class MainTest {

	private static CustoMercadoria mercadoria = new CustoMercadoria();
	
	public static void main(String[] args) {
		// realizar testes para cobrir as opções de aliquotas...
		System.out.println("Aliquota Interestadual PB->RN");
		System.out.println("Aliquota: " + AliquotaInterEstadual.selecionar("PB", "RN"));

		// teste substituição tributária...
		mercadoria.setValor(190);
		mercadoria.setUfOrigem("PB");
		mercadoria.setUfDestino("RN");
		mercadoria.setCredito(0);

		SubstituicaoTributaria st = new SubstituicaoTributaria();
		st.setCustoMercadoria(mercadoria);
		st.setAgregacao(71.78);
		st.calcular();

		System.out.println("Substituição Tributária");
		System.out.println("Imposto Destacado: " + st.getCreditoDestacado());
		System.out.println("Base de Cálculo: " + st.getBaseDeCalculo());
		System.out.println("Valor Imposto: " + st.getValor());

		// teste antentecipação entrada...
		mercadoria.setValor(1000);
		mercadoria.setUfOrigem("BA");
		mercadoria.setUfDestino("SP");
		mercadoria.setCredito(0);

		AntecipacaoEntradas ae = new AntecipacaoEntradas();
		ae.setCustoMercadoria(mercadoria);
		ae.calcular();

		System.out.println("Antecipação Entradas");
		System.out.println("Imposto Destacado: " + ae.getCreditoDestacado());
		System.out.println("Valor Imposto: " + ae.getValor());
		
		// teste diferencial saídas...
		mercadoria.setValor(2000);
		mercadoria.setUfOrigem("MG");
		mercadoria.setUfDestino("SP");
		mercadoria.setCredito(0);

		DiferencialSaidas ds = new DiferencialSaidas();
		ds.setCustoMercadoria(mercadoria);
		ds.setDataCalculo("29/09/2016");
		ds.setRotinaFuncep("ESPECIFICO");		
		ds.calcular();

		System.out.println("Diferencial Saídas");
		System.out.println("Aliquota Externa: " + ds.getAliquotaExterna());
		System.out.println("Imposto Destacado: " + ds.getCreditoDestacado());
		System.out.println("Aliquota Interna: " + ds.getAliquotaInterna());		
		System.out.println("Total Imposto: " + ds.getValor());
		System.out.println("Aliquota Funcep: " + ds.getAliquotaFuncep());
		System.out.println("Valor Funcep: " + ds.getValorFuncep());
		System.out.println("Partilha Uf Origem: " + ds.getPartilhaOrigem());
		System.out.println("Partilha Uf Destino: " + ds.getPartilhaDestino());
	}

}
