package com.xworkz.spring.vehicle.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
@Component
@Getter
public class BatteryBean {
	@Value("Z-Power")
	private String brand;
	@Value("2000.0")
	private double price;
	@Value("12")
	private int voltage;
	
	public void powerStorage() {
		System.out.println("Calling powerStorage");
	}

	@Override
	public String toString() {
		return "BatteryBean [brand=" + brand + ", price=" + price + ", voltage=" + voltage + "]";
	}

}
