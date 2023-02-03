package com.xworkz.spring.vehicle.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
@Getter
public class HeadLightBean {
	@Value("Bosch")
	private String brand;
	@Value("30")
	private int watt;
	@Value("LED")
	private String type;
	@Override
	public String toString() {
		return "HeadLightBean [brand=" + brand + ", watt=" + watt + ", type=" + type + "]";
	}
	
	

}
