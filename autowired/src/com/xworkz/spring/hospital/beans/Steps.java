package com.xworkz.spring.hospital.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.ToString;

@Component
@Getter
@ToString
public class Steps {

	@Value("Accessibility")
	private String function;

	@Value("12")
	private int noOfSteps;

	@Value("DogLegged")
	private String type;

}
