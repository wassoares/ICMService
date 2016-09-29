package org.soarescontabil.icmservice.model;

public class Funcep {

	private double percentual;
	private String baseLegal;
	private String link;

	public Funcep() {
	}

	public Funcep(double percentual) {
		setPercentual(percentual);
	}

	public double getPercentual() {
		return percentual;
	}

	public void setPercentual(double percentual) {
		this.percentual = percentual;
	}

	public String getBaseLegal() {
		return baseLegal;
	}

	public void setBaseLegal(String baseLegal) {
		this.baseLegal = baseLegal;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

}
