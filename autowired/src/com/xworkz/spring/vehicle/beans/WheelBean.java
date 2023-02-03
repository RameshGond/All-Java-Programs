package com.xworkz.spring.vehicle.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
@Getter
public class WheelBean {

	@Value("MRF")
	private String brand;
	@Value("Tubeless")
	private String type;
	@Value("3000.0")
	private double price;

	@Override
	public String toString() {
		return "WheelBean [brand=" + brand + ", type=" + type + ", price=" + price + "]";
	}

}
