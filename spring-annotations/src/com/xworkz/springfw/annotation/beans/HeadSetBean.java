package com.xworkz.springfw.annotation.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HeadSetBean {
	private String brand;
	private double price;
	private String color;
	private int warranty;
	private int serialNo;
	private int modelNo;
	private boolean quality;
	private String soundPressure;
	private double chargingDuration;
	private boolean wireless;
	private boolean extendedWarranty;
	private int chargingCapacity;
	private double rating;
	private String madeIn;

	public HeadSetBean(@Value("Boat") String brand, @Value("1299d") double price, @Value("Black") String color,
			@Value("1") int warranty, @Value("45689") int serialNo, @Value("562") int modelNo,
			@Value("true") boolean quality, @Value("Good") String soundPressure, @Value("6.8") double chargingDuration,
			@Value("false") boolean wireless, @Value("false") boolean extendedWarranty,
			@Value("2") int chargingCapacity, @Value("9.5") double rating, @Value("India") String madeIn) {
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.warranty = warranty;
		this.serialNo = serialNo;
		this.modelNo = modelNo;
		this.quality = quality;
		this.soundPressure = soundPressure;
		this.chargingDuration = chargingDuration;
		this.wireless = wireless;
		this.extendedWarranty = extendedWarranty;
		this.chargingCapacity = chargingCapacity;
		this.rating = rating;
		this.madeIn = madeIn;
	}

	@Override
	public String toString() {
		return "HeadSetBean [brand=" + brand + ", price=" + price + ", color=" + color + ", warranty=" + warranty
				+ ", serialNo=" + serialNo + ", modelNo=" + modelNo + ", quality=" + quality + ", soundPressure="
				+ soundPressure + ", chargingDuration=" + chargingDuration + ", wireless=" + wireless
				+ ", extendedWarranty=" + extendedWarranty + ", chargingCapacity=" + chargingCapacity + ", rating="
				+ rating + ", madeIn=" + madeIn + "]";
	}
	
	

	}
