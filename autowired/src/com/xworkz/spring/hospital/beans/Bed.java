package com.xworkz.spring.hospital.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.ToString;

@Component
@Getter
@ToString
public class Bed {

	@Value("Cotton")
	private String type;

	@Value("Red")
	private String color;

	@Value("2000")
	private int price;

}
