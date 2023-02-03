package com.xworkz.springfw.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CompanyDetailsBean {

	private String name;
	private int noOfEmployees;
	private String location;
	private int noOfDirectors;
	private String md;
	private String chairman;
	private String ceo;
	private String president;
	private double incomeInCr;
	private double revenueIncr;
	private double profitFor2019InCr;
	private double profitFor2020InCr;
	private double profitFor2021InCr;
	private double profitFor2022InCr;

	@Value("Iconic Group India Pvt. Ltd")
	public void setName(String name) {
		this.name = name;
	}

	@Value("2000")
	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}

	@Value("Bangalore")
	public void setLocation(String location) {
		this.location = location;
	}

	@Value("4")
	public void setNoOfDirectors(int noOfDirectors) {
		this.noOfDirectors = noOfDirectors;
	}

	@Value("Raghu H R")
	public void setMd(String md) {
		this.md = md;
	}

	@Value("Ram")
	public void setChairman(String chairman) {
		this.chairman = chairman;
	}

	@Value("Ajith")
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	@Value("Raj")
	public void setPresident(String president) {
		this.president = president;
	}

	@Value("110.5")
	public void setIncomeInCr(double incomeInCr) {
		this.incomeInCr = incomeInCr;
	}

	@Value("200.0")
	public void setRevenueIncr(double revenueIncr) {
		this.revenueIncr = revenueIncr;
	}

	@Value("35.0")
	public void setProfitFor2019InCr(double profitFor2019InCr) {
		this.profitFor2019InCr = profitFor2019InCr;
	}

	@Value("45.0")
	public void setProfitFor2020InCr(double profitFor2020InCr) {
		this.profitFor2020InCr = profitFor2020InCr;
	}

	@Value("55.0")
	public void setProfitFor2021InCr(double profitFor2021InCr) {
		this.profitFor2021InCr = profitFor2021InCr;
	}

	@Value("65.0")
	public void setProfitFor2022InCr(double profitFor2022InCr) {
		this.profitFor2022InCr = profitFor2022InCr;
	}

	@Override
	public String toString() {
		return "CompanyDetailsBean [name=" + name + ", noOfEmployees=" + noOfEmployees + ", location=" + location
				+ ", noOfDirectors=" + noOfDirectors + ", md=" + md + ", chairman=" + chairman + ", ceo=" + ceo
				+ ", president=" + president + ", incomeInCr=" + incomeInCr + ", revenueIncr=" + revenueIncr
				+ ", profitFor2019InCr=" + profitFor2019InCr + ", profitFor2020InCr=" + profitFor2020InCr
				+ ", profitFor2021InCr=" + profitFor2021InCr + ", profitFor2022InCr=" + profitFor2022InCr + "]";
	}

}
