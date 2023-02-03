package com.xworkz.spring.hospital.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.ToString;

@Component
@Getter
@ToString
public class Knife {

	@Value("Sharp")
	private String condition;

	@Value("Black")
	private String handleColor;

	@Value("60")
	private int price;

}
