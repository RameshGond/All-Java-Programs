package com.xworkz.springmvc.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class TestController {
	
	public TestController() {
		System.out.println("Created test controller");
	}
	
	@RequestMapping("/call")
	public String onTest() {
		System.out.println("calling on test method");
		return "index.html";
	}

}
