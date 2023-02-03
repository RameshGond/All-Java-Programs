package com.xworkz.spring.hospital.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.ToString;

@Component
@Getter
@ToString
public class Land {

	@Value("7/12")
	private String surveyNo;
	@Value("1 acre")
	private String size;
	@Value("100000")
	private int price;

}
