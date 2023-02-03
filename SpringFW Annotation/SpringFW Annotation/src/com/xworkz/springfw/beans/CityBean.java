package com.xworkz.springfw.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CityBean {

	private String name;
	private double area;
	private String muncipalCommissioner;
	private String policeCommissioner;
	private String mayor;
	private int noOfWards;
	private int southWards;
	private int northWards;
	private int eastWards;
	private int westWards;
	private double population;
	private String southDcp;
	private String northDcp;
	private String eastWestDcp;

	public CityBean(@Value("Bangalore") String name, @Value("4800.5") double area,
			@Value("Thushar Girinath") String muncipalCommissioner, @Value("Pratap Reddy") String policeCommissioner,
			@Value("Venkatesh") String mayor, @Value("200") int noOfWards, @Value("45") int southWards,
			@Value("55") int northWards, @Value("65") int eastWards, @Value("35") int westWards,
			@Value("1.85") double population, @Value("Raj") String southDcp, @Value("Ram") String northDcp,
			@Value("Ajith") String eastWestDcp) {

		super();
		this.name = name;
		this.area = area;
		this.muncipalCommissioner = muncipalCommissioner;
		this.policeCommissioner = policeCommissioner;
		this.mayor = mayor;
		this.noOfWards = noOfWards;
		this.southWards = southWards;
		this.northWards = northWards;
		this.eastWards = eastWards;
		this.westWards = westWards;
		this.population = population;
		this.southDcp = southDcp;
		this.northDcp = northDcp;
		this.eastWestDcp = eastWestDcp;
	}

	@Override
	public String toString() {
		return "CityBean [name=" + name + ", area=" + area + ", muncipalCommissioner=" + muncipalCommissioner
				+ ", policeCommissioner=" + policeCommissioner + ", mayor=" + mayor + ", noOfWards=" + noOfWards
				+ ", southWards=" + southWards + ", northWards=" + northWards + ", eastWards=" + eastWards
				+ ", westWards=" + westWards + ", population=" + population + ", southDcp=" + southDcp + ", northDcp="
				+ northDcp + ", eastWestDcp=" + eastWestDcp + "]";
	}

}
