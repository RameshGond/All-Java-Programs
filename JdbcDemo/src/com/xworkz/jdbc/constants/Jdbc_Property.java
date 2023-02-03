package com.xworkz.jdbc.constants;

public enum Jdbc_Property {
	URL("jdbc:mysql://localhost:3306/xworkz_odc"), USERNAME("root"), SECRET("xworkz@123");

	private String values;

	private Jdbc_Property(String values) {
		this.values = values;
	}

	public String getValues() {
		return values;
	}

}
