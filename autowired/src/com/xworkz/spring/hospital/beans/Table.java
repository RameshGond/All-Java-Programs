package com.xworkz.spring.hospital.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.ToString;

@Component
@Getter
@ToString
public class Table {

	@Value("Wooden")
	private String type;

	@Value("Brown")
	private String color;

	@Value("5000")
	private int price;

}
