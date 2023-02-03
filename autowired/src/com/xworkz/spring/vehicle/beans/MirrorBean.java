package com.xworkz.spring.vehicle.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
@Getter

public class MirrorBean {
	@Value("Concave")
	private String type;
	@Value("1000.0")
	private double price;
	@Value("Kannadi")
	private String brand;

	@Override
	public String toString() {
		return "MirrorBean [type=" + type + ", price=" + price + ", brand=" + brand + "]";
	}

}
