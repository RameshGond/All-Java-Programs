package com.xworz.springfw.autowired.annotation.hospital.association.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.ToString;

@Component
@Getter
@ToString
public class Ambulance {
	
	@Value("White")
	private String color;

	@Value("1")
	private byte noOfStrechers;

	@Value("15000")
	private int price;

}
