package com.xworkz.spring.hospital.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.ToString;

@Component
@Getter
@ToString
public class Switch {

	@Value("On/Off")
	private String function;

	@Value("White")
	private String color;

	@Value("5")
	private int price;

}
