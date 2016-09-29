package org.soarescontabil.icmservice.model;

public class AliquotaFuncep {

	public static double selecionar(String uf, String rotina) {
		int posicao = RotinaFuncep.valueOf(rotina).ordinal();
		Funcep [] array = Uf.valueOf(uf).obterFuncep();
		return array[posicao].getPercentual();
	}
}
