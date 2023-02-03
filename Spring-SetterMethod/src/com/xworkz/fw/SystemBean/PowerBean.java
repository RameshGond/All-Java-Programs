package com.xworkz.fw.SystemBean;

public class PowerBean {
	private String typeOfPower;

	public PowerBean(String typeOfPower) {
		this.typeOfPower = typeOfPower;
	}

	@Override
	public String toString() {
		return "typeOfPower=" + typeOfPower + "";
	}
}
