package com.xworkz.spring.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
@Getter

public class LaptopBean {
	
	private String brand;
	private double price;
	private String type;
	private double rating;
	private String color;
	private double batteryCapacity;
	private int ram;
	private int batteryLife;
	private int chargingTime;
	private long modelNo;
	private int warranty;
	private double storage;
	private String soundQuality;
	private String connectivity;

	public LaptopBean(@Value("Boat") String brand, @Value("19999.0") double price, @Value("Screentouch") String type,
			@Value("4.5") double rating, @Value("Black") String color, @Value("5000") double batteryCapacity,
			@Value("4") int ram, @Value("5") int batteryLife, @Value("1") int chargingTime,
			@Value("12345") long modelNo, @Value("6") int warranty, @Value("500.0") double storage,
			@Value("good") String soundQuality, @Value("good") String connectivity) {
		this.brand = brand;
		this.price = price;
		this.type = type;
		this.rating = rating;
		this.color = color;
		this.batteryCapacity = batteryCapacity;
		this.ram = ram;
		this.batteryLife = batteryLife;
		this.chargingTime = chargingTime;
		this.modelNo = modelNo;
		this.warranty = warranty;
		this.storage = storage;
		this.soundQuality = soundQuality;
		this.connectivity = connectivity;

	}

	@Override
	public String toString() {
		return "LaptopBean [brand=" + brand + ", price=" + price + ", type=" + type + ", rating=" + rating + ", color="
				+ color + ", batteryCapacity=" + batteryCapacity + ", ram=" + ram + ", batteryLife=" + batteryLife
				+ ", chargingTime=" + chargingTime + ", modelNo=" + modelNo + ", warranty=" + warranty + ", storage="
				+ storage + ", soundQuality=" + soundQuality + ", connectivity=" + connectivity + "]";
	}
	


}
