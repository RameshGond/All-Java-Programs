package com.xworkz.spring.hospital.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
@Component
@Getter
public class Ambulance {
	
	@Value("White")
	private String color;

	@Value("1")
	private byte noOfStrechers;

	@Value("15000")
	private int price;

	@Override
	public String toString() {
		return "Ambulance [color=" + color + ", noOfStrechers=" + noOfStrechers + ", price=" + price + "]";
	}
	
	

}
