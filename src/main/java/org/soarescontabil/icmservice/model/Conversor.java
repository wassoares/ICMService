package org.soarescontabil.icmservice.model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Conversor {

	public static double arredondar(double valor, int casas) {
		Double valorArredondado = valor;
		valorArredondado *= (Math.pow(10, casas));
		valorArredondado = (double) Math.round(valorArredondado);
		valorArredondado /= (Math.pow(10, casas));
		return valorArredondado;
	}

	public static Date formatar(String data) {
		Date dataFormatada = null;
		if (!data.equals("") || !(data == null)) {
			DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
			try {
				dataFormatada = formatador.parse(data);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return dataFormatada;
	}

}
