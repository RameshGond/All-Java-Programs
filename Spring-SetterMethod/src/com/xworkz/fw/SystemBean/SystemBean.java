package com.xworkz.fw.SystemBean;

public class SystemBean {
	private String typeOfSystem;
	private PowerBean powerBean;

	public SystemBean(String typeOfSystem, PowerBean powerBean) {
		this.powerBean = powerBean;
		this.typeOfSystem = typeOfSystem;
	}

	@Override
	public String toString() {
		return "SystemBean [typeOfSystem=" + typeOfSystem + ", " + powerBean + "]";
	}

}
