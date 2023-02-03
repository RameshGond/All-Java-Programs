package com.xworkz.springfw.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
@Getter

public class EmployeeBean {

	private String name;
	private String companyName;
	private int employeeId;
	private long epfNo;
	private String fatherName;
	private String motherName;
	private char gender;
	private String dob;
	private double height;
	private double weight;
	private String taluk;
	private String district;
	private String state;
	private String pincode;

	@Value("Raghu H R")
	public void setName(String name) {
		this.name = name;
	}

	@Value("D.E Shaw India Private Limited")
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Value("101")
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	@Value("2018456698665")
	public void setEpfNo(long epfNo) {
		this.epfNo = epfNo;
	}

	@Value("Ramaiah")
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	@Value("Anjinamma")
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	@Value("M")
	public void setGender(char gender) {
		this.gender = gender;
	}

	@Value("26-01-1997")
	public void setDob(String dob) {
		this.dob = dob;
	}

	@Value("175.0")
	public void setHeight(double height) {
		this.height = height;
	}

	@Value("64.0")
	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Value("Jubilee Hills ")
	public void setTaluk(String taluk) {
		this.taluk = taluk;
	}

	@Value("Hyderabad")
	public void setDistrict(String district) {
		this.district = district;
	}

	@Value("Telangana")
	public void setState(String state) {
		this.state = state;
	}

	@Value("500033")
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "EmployeeBean [name=" + name + ", companyName=" + companyName + ", employeeId=" + employeeId + ", epfNo="
				+ epfNo + ", fatherName=" + fatherName + ", motherName=" + motherName + ", gender=" + gender + ", dob="
				+ dob + ", height=" + height + ", weight=" + weight + ", taluk=" + taluk + ", district=" + district
				+ ", state=" + state + ", pincode=" + pincode + "]";
	}

}
