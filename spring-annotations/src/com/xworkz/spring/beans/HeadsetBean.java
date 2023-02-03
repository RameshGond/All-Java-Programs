package com.xworkz.spring.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
@Getter

public class HeadsetBean {

	private String brand;
	private double price;
	private String type;
	private double rating;
	private String color;
	private int wirelessRange;
	private boolean waterResistence;
	private int batteryLife;
	private int chargingTime;
	private long modelNo;
	private int warranty;
	private boolean deepBass;
	private String soundQuality;
	private String connectivity;

	public HeadsetBean(@Value("Boat") String brand, @Value("1499.0") double price, @Value("Wireless") String type,
			@Value("4.5") double rating, @Value("Black") String color, @Value("10") int wirelessRange,
			@Value("true") boolean waterResistence, @Value("20") int batteryLife, @Value("1") int chargingTime,
			@Value("12345") long modelNo, @Value("6") int warranty, @Value("true") boolean deepBass,
			@Value("good") String soundQuality, @Value("good") String connectivity) {
		this.brand = brand;
		this.price = price;
		this.type = type;
		this.rating = rating;
		this.color = color;
		this.wirelessRange = wirelessRange;
		this.waterResistence = waterResistence;
		this.batteryLife = batteryLife;
		this.chargingTime = chargingTime;
		this.modelNo = modelNo;
		this.warranty = warranty;
		this.deepBass = deepBass;
		this.soundQuality = soundQuality;
		this.connectivity = connectivity;

	}

	@Override
	public String toString() {
		return "HeadsetBean [brand=" + brand + ", price=" + price + ", type=" + type + ", rating=" + rating + ", color="
				+ color + ", wirelessRange=" + wirelessRange + ", waterResistence=" + waterResistence + ", batteryLife="
				+ batteryLife + ", chargingTime=" + chargingTime + ", modelNo=" + modelNo + ", warranty=" + warranty
				+ ", deepBass=" + deepBass + ", soundQuality=" + soundQuality + ", connectivity=" + connectivity + "]";
	}

}
