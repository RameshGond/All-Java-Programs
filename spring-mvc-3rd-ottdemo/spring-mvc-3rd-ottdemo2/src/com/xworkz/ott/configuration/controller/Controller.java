package com.xworkz.ott.configuration.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Controller {

	public Controller() {
		System.out.println("Controller created");
	}
	
	
	@RequestMapping("/test.do")
	public String doSave() {
		System.out.println("doSave created...");
		return "index.html";	
	}
}
