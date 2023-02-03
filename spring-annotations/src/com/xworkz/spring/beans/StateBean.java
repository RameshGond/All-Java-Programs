package com.xworkz.spring.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
@Getter

public class StateBean {
	
	private String name;
	private String cmName;
	private String gevernor;
	private String chiefSecretary;
	private String capitalCity;
	private double area;
	private int noOfEngClgs;
	private int noOfdistricts;
	private int noOfTaluks;
	private int noOfVillages;
	private int noOfCities;
	private int noOfGp;
	private double population;
	private int noOfMinisters;

	public StateBean(@Value("Karnataka") String name, @Value("Bommai") String cmName, @Value("Gehlot") String gevernor,
			@Value("Vandita Sharma") String chiefSecretary, @Value("Bangalore") String capitalCity,
			@Value("28000.00") double area, @Value("250") int noOfEngClgs, @Value("30") int noOfdistricts,
			@Value("234") int noOfTaluks, @Value("12000") int noOfVillages, @Value("80") int noOfCities,
			@Value("3850") int noOfGp, @Value("7.85") double population, @Value("35") int noOfMinisters) {
	
		this.name = name;
		this.cmName = cmName;
		this.gevernor = gevernor;
		this.chiefSecretary = chiefSecretary;
		this.capitalCity = capitalCity;
		this.area = area;
		this.noOfEngClgs = noOfEngClgs;
		this.noOfdistricts = noOfdistricts;
		this.noOfTaluks = noOfTaluks;
		this.noOfVillages = noOfVillages;
		this.noOfCities = noOfCities;
		this.noOfGp = noOfGp;
		this.population = population;
		this.noOfMinisters = noOfMinisters;
	}

	@Override
	public String toString() {
		return "StateBean [name=" + name + ", cmName=" + cmName + ", gevernor=" + gevernor + ", chiefSecretary="
				+ chiefSecretary + ", capitalCity=" + capitalCity + ", area=" + area + ", noOfEngClgs=" + noOfEngClgs
				+ ", noOfdistricts=" + noOfdistricts + ", noOfTaluks=" + noOfTaluks + ", noOfVillages=" + noOfVillages
				+ ", noOfCities=" + noOfCities + ", noOfGp=" + noOfGp + ", population=" + population
				+ ", noOfMinisters=" + noOfMinisters + "]";
	}


}
