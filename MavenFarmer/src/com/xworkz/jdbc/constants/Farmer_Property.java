package com.xworkz.jdbc.constants;

public enum Farmer_Property {
	URL("jdbc:mysql://localhost:3306/bihar_patna"), USERNAME("root"), SECRET("xworkz@123");

	private String values;

	private Farmer_Property(String values) {
		this.values = values;
	}

	public String getValues() {
		return values;
	}

}
