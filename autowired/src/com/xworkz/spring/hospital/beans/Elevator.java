package com.xworkz.spring.hospital.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.ToString;

@Component
@Getter
@ToString
public class Elevator {

	@Value("Accessibility")
	private String function;

	@Value("10")
	private int NoOfSteps;

	@Value("200000")
	private int price;

}
