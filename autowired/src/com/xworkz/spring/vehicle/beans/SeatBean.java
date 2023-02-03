package com.xworkz.spring.vehicle.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
@Getter
public class SeatBean {
	@Value("Convertable car seat")
	private String type;
	@Value("5500")
	private double price;
	@Value("Brown")
	private String color;


	@Override
	public String toString() {
		return "SeatBean [type=" + type + ", price=" + price + ", color=" + color + "]";
	}

}
