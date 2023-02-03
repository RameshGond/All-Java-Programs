package com.xworkz.ott.configuration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.ott.configuration.dto.OttDTO;
import com.xworkz.ott.configuration.service.OttService;

@Component
@RequestMapping("/")
public class ControllerContent {
	public ControllerContent() {
		System.out.println("ControllerContent created");
	}
	@Autowired
	private OttService ottservice;
	
	@RequestMapping("/content.do")
    public String doContent(OttDTO dto) { //re
		System.out.println(dto);
		ottservice.validateAndSave(dto);
		return "content.html";	
	}

	
}
