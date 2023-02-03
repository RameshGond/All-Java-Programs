package com.xworkz.ott.configuration.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OttDTO {
	
	private String ottName;
	private String region;
	private String subscriptionPlan;
	private int members;
	private int since;
	private String language;
	private boolean active;
	
	public OttDTO() {
		System.out.println("OttDTO Created...");
	}

}
