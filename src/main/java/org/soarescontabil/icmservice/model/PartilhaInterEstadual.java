package org.soarescontabil.icmservice.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PartilhaInterEstadual {

	private static List<Partilha> partilhas = new ArrayList<>();

	public static List<Partilha> getPartilhas() {
		partilhas.add(new Partilha(Conversor.formatar("01/01/2016"), Conversor.formatar("31/12/2016"), 0.6, 0.4));
		partilhas.add(new Partilha(Conversor.formatar("01/01/2017"), Conversor.formatar("31/12/2017"), 0.4, 0.6));
		partilhas.add(new Partilha(Conversor.formatar("01/01/2018"), Conversor.formatar("31/12/2018"), 0.2, 0.8));
		partilhas.add(new Partilha(Conversor.formatar("01/01/2019"), Conversor.formatar("31/12/2019"), 0, 1));
		return partilhas;
	}

	public static Partilha selecionar(String virgencia) {
		Date calculo = Conversor.formatar(virgencia);
		for (Partilha partilha : getPartilhas()) {
			if (calculo.after(partilha.getDataInicio()) && calculo.before(partilha.getDataFinal())) {
				return partilha;
			}
		}
		return null;
	}

}
