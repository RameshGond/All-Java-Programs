package com.xworkz.spring.hospital.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.ToString;

@Component
@Getter
@ToString
public class Cot {
	
	
	@Value("steel")
	private String type;

	@Value("Black")
	private String color;

	@Value("15000")
	private int price;

}
