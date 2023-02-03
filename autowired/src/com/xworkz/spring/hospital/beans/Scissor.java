package com.xworkz.spring.hospital.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.ToString;

@Component
@Getter
@ToString
public class Scissor {

	@Value("Sharp")
	private String condition;

	@Value("Brown")
	private String handleColor;

	@Value("60")
	private int price;

}
