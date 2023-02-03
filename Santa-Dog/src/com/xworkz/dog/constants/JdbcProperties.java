package com.xworkz.dog.constants;

public enum JdbcProperties {
	URL("jdbc:mysql://localhost:3306/bihar_patna"), USERNAME("root"), SECRET("xworkz@123");

	private String values;

	private JdbcProperties(String values) {
		this.values = values;
	}

	public String getValues() {
		return values;
	}

}
