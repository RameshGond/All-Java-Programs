package com.xworkz.spring.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
@Getter

public class MobileBean {
	
	private String brand;
	private double price;
	private String type;
	private double rating;
	private String color;
	private int noOfSimSlot;
	private boolean waterResistence;
	private int batteryLife;
	private int chargingTime;
	private long modelNo;
	private int warranty;
	private boolean memoryCard;
	private String soundQuality;
	private String connectivity;

	public MobileBean(@Value("Vivo") String brand, @Value("25000.0") double price, @Value("Android") String type,
			@Value("4.5") double rating, @Value("Blue") String color, @Value("2") int noOfSimSlot,
			@Value("true") boolean waterResistence, @Value("20") int batteryLife, @Value("1") int chargingTime,
			@Value("12345") long modelNo, @Value("12") int warranty, @Value("true") boolean memoryCard,
			@Value("good") String soundQuality, @Value("good") String connectivity) {
		this.brand = brand;
		this.price = price;
		this.type = type;
		this.rating = rating;
		this.color = color;
		this.noOfSimSlot = noOfSimSlot;
		this.waterResistence = waterResistence;
		this.batteryLife = batteryLife;
		this.chargingTime = chargingTime;
		this.modelNo = modelNo;
		this.warranty = warranty;
		this.memoryCard = memoryCard;
		this.soundQuality = soundQuality;
		this.connectivity = connectivity;

	}

	@Override
	public String toString() {
		return "MobileBean [brand=" + brand + ", price=" + price + ", type=" + type + ", rating=" + rating + ", color="
				+ color + ", noOfSimSlot=" + noOfSimSlot + ", waterResistence=" + waterResistence + ", batteryLife="
				+ batteryLife + ", chargingTime=" + chargingTime + ", modelNo=" + modelNo + ", warranty=" + warranty
				+ ", memoryCard=" + memoryCard + ", soundQuality=" + soundQuality + ", connectivity=" + connectivity
				+ "]";
	}
	


}
