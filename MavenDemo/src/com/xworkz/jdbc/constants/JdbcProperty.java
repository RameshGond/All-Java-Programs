package com.xworkz.jdbc.constants;

public enum JdbcProperty {
	URL("jdbc:mysql://localhost:3306/xworkz_odc"), USERNAME("root"), SECRET("xworkz@123");

	private String values;

	private JdbcProperty(String values) {
		this.values = values;
	}

	public String getValues() {
		return values;
	}

}
