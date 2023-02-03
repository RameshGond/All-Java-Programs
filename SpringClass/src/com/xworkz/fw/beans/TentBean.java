package com.xworkz.fw.beans;

public class TentBean {

	private String brand;
	private String color;
	private Double price;

	public TentBean() {
		System.out.println("From NoArgConstructor BeanName :" + this.getClass().getSimpleName());
	}

	public void tentDetails() {

		System.out.println("Brand: " + this.brand + "   Color: " + this.color + "  Price: " + this.price);
	}

	public TentBean(String brand) {
		this.brand = brand;
	}

	public TentBean(Double price) {
		this.price = price;

	}

	public TentBean(String brand, String color) {
		this.brand = brand;
		this.color = color;

	}

	public TentBean(Double price, String brand) {
		this.price = price;
		this.brand = brand;

	}

	public TentBean(String brand, Double price) {
		this.brand = brand;
		this.price = price;

	}

	public TentBean(String brand, String color, Double price) {
		this.brand = brand;
		this.color = color;
		this.price = price;

	}

	public TentBean(Double price, String brand, String color) {
		this.price = price;
		this.brand = brand;
		this.color = color;

	}

	public TentBean(String brand, Double price, String color) {

		this.brand = brand;
		this.price = price;
		this.color = color;
	}
	
	public String getBrand() {
		return brand;
		
	}
	
	public Double getPrice() {
		return price;
		
	}
	
	public String getColor() {
		return brand;
		
	}
}
