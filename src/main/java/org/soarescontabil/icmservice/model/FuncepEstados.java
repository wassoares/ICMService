package org.soarescontabil.icmservice.model;

public class FuncepEstados {
	
	public static Funcep[] carregarDadosAC() {
		Funcep[] array = new Funcep[2];
		array[0] = new Funcep(0.01);
		array[1] = new Funcep(0);
		return array;
	}

	public static Funcep[] carregarDadosAL() {
		Funcep padrao = new Funcep(0.01);
		padrao.setBaseLegal("Lei Nº 7.767/2015");
		padrao.setLink(
				"http://gcs.sefaz.al.gov.br/sfz-gcs-web/documentos/visualizarDocumento.action;jsessionid=ctq51ptv721r18fswf4kzogb5?key=2oiA1FSqfpQ%3D&acess=1");
		Funcep especifico = new Funcep(0.02);
		especifico.setBaseLegal("Lei Nº 7.767/2015");
		especifico.setLink(
				"http://gcs.sefaz.al.gov.br/sfz-gcs-web/documentos/visualizarDocumento.action;jsessionid=ctq51ptv721r18fswf4kzogb5?key=2oiA1FSqfpQ%3D&acess=1");
		Funcep[] array = new Funcep[2];
		array[0] = padrao;
		array[1] = especifico;
		return array;
	}

	public static Funcep[] carregarDadosAM() {
		Funcep[] array = new Funcep[2];
		array[0] = new Funcep(0.01);
		array[1] = new Funcep(0);
		return array;
	}

	public static Funcep[] carregarDadosAP() {
		Funcep[] array = new Funcep[2];
		array[0] = new Funcep(0.01);
		array[1] = new Funcep(0);
		return array;
	}

	public static Funcep[] carregarDadosBA() {
		Funcep especifico = new Funcep(0.02);
		especifico.setBaseLegal("Lei Nº 7.988/2001");
		especifico.setLink("http://governo-ba.jusbrasil.com.br/legislacao/85759/lei-7988-01");
		Funcep[] array = new Funcep[2];
		array[0] = new Funcep(0.01);
		array[1] = especifico;
		return array;
	}

	public static Funcep[] carregarDadosCE() {
		Funcep especifico = new Funcep(0.02);
		especifico.setBaseLegal("Lei Complementar Nº 37/2003");
		especifico.setLink(
				"http://www.arce.ce.gov.br/index.php/legislacao/leis?download=151%3Alei-complementar-37-de-261103&start=20");
		Funcep[] array = new Funcep[2];
		array[0] = new Funcep(0.01);
		array[1] = especifico;
		return array;
	}

	public static Funcep[] carregarDadosDF() {
		Funcep especifico = new Funcep(0.02);
		especifico.setBaseLegal("Lei Nº 2.220/2008");
		especifico.setLink(
				"http://www.fazenda.df.gov.br/aplicacoes/legislacao/legislacao/TelaSaidaDocumento.cfm?txtNumero=4220&txtAno=2008&txtTipo=5&txtParte=.");
		Funcep[] array = new Funcep[2];
		array[0] = new Funcep(0.01);
		array[1] = especifico;
		return array;
	}

	public static Funcep[] carregarDadosES() {
		Funcep especifico = new Funcep(0.02);
		especifico.setBaseLegal("Lei Complementar Nº 336/2005");
		especifico.setLink("http://www.al.es.gov.br/antigo_portal_ales/images/leis/html/LC%20n%C2%BA%20336.html");
		Funcep[] array = new Funcep[2];
		array[0] = new Funcep(0.01);
		array[1] = especifico;
		return array;
	}

	public static Funcep[] carregarDadosEX() {
		Funcep[] array = new Funcep[2];
		array[0] = new Funcep(0.01);
		array[1] = new Funcep(0);
		return array;
	}

	public static Funcep[] carregarDadosGO() {
		Funcep padrao = new Funcep(0.02);
		padrao.setBaseLegal("Lei Nº 14.469/2003");
		padrao.setLink("http://www.gabinetecivil.goias.gov.br/leis_ordinarias/2003/lei_14469.htm");
		Funcep[] array = new Funcep[2];
		array[0] = padrao;
		array[1] = new Funcep(0);
		return array;
	}

	public static Funcep[] carregarDadosMA() {
		Funcep especifico = new Funcep(0.02);
		especifico.setBaseLegal("Lei Nº 8.205/2004");
		especifico.setLink("http://portal.sefaz.ma.gov.br/portalsefaz/pdf?codigo=577");
		Funcep[] array = new Funcep[2];
		array[0] = new Funcep(0.01);
		array[1] = especifico;
		return array;
	}

	public static Funcep[] carregarDadosMG() {
		Funcep especifico = new Funcep(0.02);
		especifico.setBaseLegal("Decreto Nº 46.927/2015");
		especifico.setLink("http://www.fazenda.mg.gov.br/empresas/legislacao_tributaria/decretos/2015/d46927_2015.htm");
		Funcep[] array = new Funcep[2];
		array[0] = new Funcep(0.01);
		array[1] = especifico;
		return array;
	}

	public static Funcep[] carregarDadosMT() {
		Funcep especifico = new Funcep(0.02);
		especifico.setBaseLegal("Lei Complementar Nº 144/2003");
		especifico.setLink(
				"http://app1.sefaz.mt.gov.br/sistema/legislacao/LeiComplEstadual.nsf/9733a1d3f5bb1ab384256710004d4754/0135d236cffb96e204256e120070486a?OpenDocument");
		Funcep[] array = new Funcep[2];
		array[0] = new Funcep(0.01);
		array[1] = especifico;
		return array;
	}

	public static Funcep[] carregarDadosMS() {
		Funcep especifico = new Funcep(0.02);
		especifico.setBaseLegal("Lei Nº 3.337/2006");
		especifico.setLink(
				"http://www.icmstransparente.ms.gov.br/index.aspx?sf=http://arq.sefaz.ms.gov.br/inicio/legislacao.asp");
		Funcep[] array = new Funcep[2];
		array[0] = new Funcep(0.01);
		array[1] = especifico;
		return array;
	}

	public static Funcep[] carregarDadosPA() {
		Funcep[] array = new Funcep[2];
		array[0] = new Funcep(0.01);
		array[1] = new Funcep(0);
		return array;
	}

	public static Funcep[] carregarDadosPB() {
		Funcep especifico = new Funcep(0.02);
		especifico.setBaseLegal("Lei Nº 7.611/2004");
		especifico.setLink(
				"http://legisla.receita.pb.gov.br/LEGISLACAO/LEIS-ESTADUAIS/ICMS/LEI-7611-04-FUNCEP/LEI-7611-04_761104.html");
		Funcep[] array = new Funcep[2];
		array[0] = new Funcep(0.01);
		array[1] = especifico;
		return array;
	}

	public static Funcep[] carregarDadosPE() {
		Funcep especifico = new Funcep(0.02);
		especifico.setBaseLegal("Lei Nº 12.523/2003");
		especifico.setLink(
				"https://www.sefaz.pe.gov.br/Legislacao/Tributaria/Documents/Legislacao/Leis_Tributarias/2003/Lei12523_2003.htm");
		Funcep[] array = new Funcep[2];
		array[0] = new Funcep(0.01);
		array[1] = especifico;
		return array;
	}

	public static Funcep[] carregarDadosPI() {
		Funcep especifico = new Funcep(0.02);
		especifico.setBaseLegal("Lei Nº 6.745/2015");
		especifico.setLink("http://www.sefaz.pi.gov.br/phocadownload/Leis/2016/012016/05012016/lei%206.745.pdf");
		Funcep[] array = new Funcep[2];
		array[0] = new Funcep(0.01);
		array[1] = especifico;
		return array;
	}

	public static Funcep[] carregarDadosPR() {
		Funcep especifico = new Funcep(0.02);
		especifico.setBaseLegal("Lei Nº 18.573/2015");
		especifico.setLink("http://www.sefanet.pr.gov.br/dados/SEFADOCUMENTOS/7199611580.pdf");
		Funcep[] array = new Funcep[2];
		array[0] = new Funcep(0.01);
		array[1] = especifico;
		return array;
	}

	public static Funcep[] carregarDadosRJ() {
		Funcep padrao = new Funcep(0.02);
		padrao.setBaseLegal("Lei Nº 4.056/2002");
		padrao.setLink(
				"http://www.fazenda.rj.gov.br/sefaz/faces/oracle/webcenter/portalapp/pages/navigation-renderer.jspx?_afrLoop=452696921157000&datasource=UCMServer%23dDocName%3A98979&_adf.ctrl-state=5krz8vz4a_41");
		Funcep[] array = new Funcep[2];
		array[0] = padrao;
		array[1] = new Funcep(0);
		return array;
	}

	public static Funcep[] carregarDadosRN() {
		Funcep especifico = new Funcep(0.02);
		especifico.setBaseLegal("Lei Complementar Nº 261/2003");
		especifico.setLink(
				"http://www.set.rn.gov.br/contentProducao/aplicacao/set_v2/legislacao/enviados/normas_recentes_detalhe.asp?sTipoNoticia=&nCodigoNoticia=18");
		Funcep[] array = new Funcep[2];
		array[0] = new Funcep(0.01);
		array[1] = especifico;
		return array;
	}

	public static Funcep[] carregarDadosRO() {
		Funcep padrao = new Funcep(0.02);
		padrao.setBaseLegal("Lei Nº 842/2015");
		padrao.setLink(
				"http://www.portal.sefin.ro.gov.br/site/arquivos/anexos/978.147157448104LC15_842_INSTITUI_O_FECOEP.pdf");
		Funcep[] array = new Funcep[2];
		array[0] = padrao;
		array[1] = new Funcep(0);
		return array;
	}

	public static Funcep[] carregarDadosRR() {
		Funcep[] array = new Funcep[2];
		array[0] = new Funcep(0.01);
		array[1] = new Funcep(0);
		return array;
	}

	public static Funcep[] carregarDadosRS() {
		Funcep especifico = new Funcep(0.02);
		especifico.setBaseLegal("Lei Nº 14.742/2015");
		especifico.setLink(
				"http://www.legislacao.sefaz.rs.gov.br/Site/Document.aspx?inpKey=242088&inpCodDispositive=&inpDsKeywords=");
		Funcep[] array = new Funcep[2];
		array[0] = new Funcep(0.01);
		array[1] = especifico;
		return array;
	}

	public static Funcep[] carregarDadosSC() {
		Funcep[] array = new Funcep[2];
		array[0] = new Funcep(0.01);
		array[1] = new Funcep(0);
		return array;
	}

	public static Funcep[] carregarDadosSE() {
		Funcep especifico = new Funcep(0.02);
		especifico.setBaseLegal("Lei Nº 8.042/2015");
		especifico.setLink(
				"http://legislacao.sefaz.se.gov.br/legisinternet.dll/Infobase3/07-Leis/leisestaduais/27-leis-15/lei-8042-15.htm");
		Funcep[] array = new Funcep[2];
		array[0] = new Funcep(0.01);
		array[1] = especifico;
		return array;
	}

	public static Funcep[] carregarDadosSP() {
		Funcep especifico = new Funcep(0.02);
		especifico.setBaseLegal("Lei Nº 16.006/2015");
		especifico.setLink(
				"http://info.fazenda.sp.gov.br/NXT/gateway.dll/legislacao_tributaria/leis/lei16006.htm?f=templates$fn=document-frame.htm");
		Funcep[] array = new Funcep[2];
		array[0] = new Funcep(0.01);
		array[1] = especifico;
		return array;
	}

	public static Funcep[] carregarDadosTO() {
		Funcep especifico = new Funcep(0.02);
		especifico.setBaseLegal("Lei Nº 3.015/2015");
		especifico.setLink("http://dtri.sefaz.to.gov.br/legislacao/ntributaria/Leis/Lei3.015.15.htm");
		Funcep[] array = new Funcep[2];
		array[0] = new Funcep(0.01);
		array[1] = especifico;
		return array;
	}

}
