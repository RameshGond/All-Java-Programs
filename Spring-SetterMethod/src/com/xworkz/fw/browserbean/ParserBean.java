package com.xworkz.fw.browserbean;

public class ParserBean {
	private String typeOfParser;

	public ParserBean(String typeOfParser) {
		this.typeOfParser = typeOfParser;
	}

	@Override
	public String toString() {
		return "typeOfParser=" + typeOfParser + "";
	}

}
