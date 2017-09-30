package org.soarescontabil.icmservice.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PartilhaInterEstadual {

	private static List<Partilha> partilhas = new ArrayList<>();

	public static List<Partilha> getPartilhas() {
		partilhas.add(new Partilha(Conversor.formatar("2016-01-01"), Conversor.formatar("2016-12-31"), 0.6, 0.4));
		partilhas.add(new Partilha(Conversor.formatar("2017-01-01"), Conversor.formatar("2017-12-31"), 0.4, 0.6));
		partilhas.add(new Partilha(Conversor.formatar("2018-01-01"), Conversor.formatar("2018-12-31"), 0.2, 0.8));
		partilhas.add(new Partilha(Conversor.formatar("2019-01-01"), Conversor.formatar("2019-12-31"), 0, 1));
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
