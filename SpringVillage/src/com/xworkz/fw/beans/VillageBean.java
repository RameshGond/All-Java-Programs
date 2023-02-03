package com.xworkz.fw.beans;

public class VillageBean {
	private String name;
	private Integer noOfHouse;
	private Double population;
	private Boolean hospital;
	private String taluk;

	public VillageBean() {
		System.out.println("fromNoArgConstructor BeanName: " + this.getClass().getSimpleName());
	}

	public VillageBean(String name, Integer noOfHouse, Double population, Boolean hospital, String taluk) {
		this.name = name;
		this.noOfHouse = noOfHouse;
		this.population = population;
		this.hospital = hospital;
		this.taluk = taluk;

	}

	public VillageBean(Integer noOfHouse, String name, Double population, Boolean hospital, String taluk) {
		this.noOfHouse = noOfHouse;
		this.name = name;
		this.population = population;
		this.hospital = hospital;
		this.taluk = taluk;

	}

	public VillageBean(Double population, Integer noOfHouse, String name, Boolean hospital, String taluk) {
		this.population = population;
		this.noOfHouse = noOfHouse;
		this.name = name;
		this.hospital = hospital;
		this.taluk = taluk;

	}

	public VillageBean(Boolean hospital, Double population, Integer noOfHouse, String name, String taluk) {
		this.hospital = hospital;
		this.population = population;
		this.noOfHouse = noOfHouse;
		this.name = name;
		this.taluk = taluk;
	}

	public VillageBean(String taluk, Boolean hospital, Double population, Integer noOfHouse, String name) {
		this.taluk = taluk;
		this.hospital = hospital;
		this.population = population;
		this.noOfHouse = noOfHouse;
		this.name = name;

	}

	public void villagedetails() {
		System.out.println("VillageName: " + this.name);
		System.out.println("  NoOfHouse: " + this.noOfHouse);
		System.out.println(" Population: " + this.population);
		System.out.println("   Hospital: " + this.hospital);
		System.out.println("      Taluk: " + this.taluk);
	}

	public String getTaluk() {
		return name;

	}

	public Boolean gethospital() {
		return hospital;

	}

	public Double getpopulation() {
		return population;

	}

	public Integer getnoOfHouse() {
		return noOfHouse;

	}

	public String getname() {
		return name;

	}

}
