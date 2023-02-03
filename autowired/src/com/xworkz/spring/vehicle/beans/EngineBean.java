package com.xworkz.spring.vehicle.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
@Getter

public class EngineBean {

	@Value("Eicher")
	private String brand;
	@Value("5000.0")
	private double price;
	@Value("DieselEngine")
	private String type;

	@Override
	public String toString() {
		return "EngineBean [brand=" + brand + ", price=" + price + ", type=" + type + "]";
	}

}
