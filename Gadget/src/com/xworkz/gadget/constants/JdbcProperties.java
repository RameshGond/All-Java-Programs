package com.xworkz.gadget.constants;

public enum JdbcProperties {
	
	
	
	
	
	
	
	URL("jdbc:mysql://localhost:3306/bihar_patna"), USERNAME("root"), SECRET("xworkz@123");

	private String value;

	private JdbcProperties(String value) {
		this.value = value;
		System.out.println(value);
	}

	public String getValue() {
		return value;
	}

}
