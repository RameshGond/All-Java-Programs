package com.xworkz.fw.fishBean;

public class FishBean {
	private String name;
	private double ratePerKg;

	public FishBean(String name, double ratePerKg) {
		this.name = name;
		this.ratePerKg = ratePerKg;
	}

	@Override
	public String toString() {
		return "name=" + name + ", ratePerKg=" + ratePerKg + "";
	}

}
