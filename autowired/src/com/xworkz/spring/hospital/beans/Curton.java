package com.xworkz.spring.hospital.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.ToString;

@Component
@Getter
@ToString
public class Curton {
	
	@Value("Cream")
	private String color;

	@Value("0.5*0.5")
	private String size;

	@Value("500")
	private int price;

}
