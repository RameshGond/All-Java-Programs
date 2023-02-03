package com.xworkz.spring.vehicle.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
@Getter
public class CarGlassBean {
	@Value("true")
	private boolean bulletProof;
	@Value("5")
	private int thickness;
	@Value("Tempered")
	private String type;
	@Override
	public String toString() {
		return "CarGlassBean [bulletProof=" + bulletProof + ", thickness=" + thickness + ", type=" + type + "]";
	}
	
	

}
