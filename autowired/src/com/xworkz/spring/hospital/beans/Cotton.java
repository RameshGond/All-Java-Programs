package com.xworkz.spring.hospital.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.ToString;

@Component
@Getter
@ToString
public class Cotton {

	@Value("Cleaning")
	private String pupose;

	@Value("white")
	private String color;

	@Value("20")
	private int price;

}
