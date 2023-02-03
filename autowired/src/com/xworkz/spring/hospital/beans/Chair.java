package com.xworkz.spring.hospital.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.ToString;

@Component
@Getter
@ToString
public class Chair {

	@Value("plastic")
	private String type;

	@Value("Red")
	private String color;

	@Value("800")
	private int price;

}
