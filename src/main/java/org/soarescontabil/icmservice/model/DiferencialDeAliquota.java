package org.soarescontabil.icmservice.model;

public class DiferencialDeAliquota extends ImpostoGenerico {
	
	@Override
	public void calcular() {
		baseDeCalculo = custoMercadoria.getValor() - getCredito();
		baseDeCalculo = baseDeCalculo / (1 - (getAliquotaInterna() / 100));
		baseDeCalculo = (baseDeCalculo * getAliquotaInterna()) / 100;	
		valor = baseDeCalculo - getCredito();		
	}

}
