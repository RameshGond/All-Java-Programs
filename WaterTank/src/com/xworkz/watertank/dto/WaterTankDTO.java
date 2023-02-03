package com.xworkz.watertank.dto;
import java.io.Serializable;
public class WaterTankDTO implements Serializable {
	private Integer capacity;
	private String color;
	private String brand;
	private Double price;
	private Integer warrenty;
	
	public WaterTankDTO()
	{
		System.out.println("water tank dto no args");
	}
	
	public String toString() {
		return "Water Tank";
	}
	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getWarrenty() {
		return warrenty;
	}

	public void setWarrenty(Integer warrenty) {
		this.warrenty = warrenty;
	}

	
	
	
	
	
}