package org.soarescontabil.icmservice.model;

public class Importancia {

	public static double arredondar(double valor, int casas) {
		Double arredondado = valor;
		arredondado *= (Math.pow(10, casas));
		arredondado = (double) Math.round(arredondado);
		arredondado /= (Math.pow(10, casas));
		return arredondado;
	}

}
