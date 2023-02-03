package com.xworkz.spring.vehicle.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
@Getter
public class DoorBean {

	@Value("Butterfly Door")
	private String type;
	@Value("3000.0")
	private double price;
	@Value("White")
	private String color;

	@Override
	public String toString() {
		return "DoorBean [type=" + type + ", price=" + price + ", color=" + color + "]";
	}

}
