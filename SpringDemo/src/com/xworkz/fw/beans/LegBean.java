package com.xworkz.fw.beans;

public class LegBean {
	public LegBean() {
		System.out.println("created leg " + this.getClass().getSimpleName());
	}

	public void walking() {
		System.out.println("leg is used to walking");

	}

}
