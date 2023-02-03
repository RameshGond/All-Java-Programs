package com.xworkz.springfw.beans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class StudentBean {

	private String name;
	private int id;
	private long regNo;
	private String fatherName;
	private String motherName;
	private char gender;
	private String dob;
	private double height;
	private double weight;
	private String schoolName;
	private String taluk;
	private String district;
	private String state;
	private String pincode;

	@Value("Raghu H R")
	public void setName(String name) {
		this.name = name;
	}

	@Value("101")
	public void setId(int id) {
		this.id = id;
	}

	@Value("20120684358")
	public void setRegNo(long regNo) {
		this.regNo = regNo;
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

	@Value("15-08-1997")
	public void setDob(String dob) {
		this.dob = dob;
	}

	@Value("170.0")
	public void setHeight(double height) {
		this.height = height;
	}

	@Value("64.0")
	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Value("GHS Tumkur")
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	@Value("Tumkur")
	public void setTaluk(String taluk) {
		this.taluk = taluk;
	}

	@Value("Tumkur")
	public void setDistrict(String district) {
		this.district = district;
	}

	@Value("Karnataka")
	public void setState(String state) {
		this.state = state;
	}

	@Value("572104")
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "StudentBean [name=" + name + ", id=" + id + ", regNo=" + regNo + ", fatherName=" + fatherName
				+ ", motherName=" + motherName + ", gender=" + gender + ", dob=" + dob + ", height=" + height
				+ ", weight=" + weight + ", schoolName=" + schoolName + ", taluk=" + taluk + ", district=" + district
				+ ", state=" + state + ", pincode=" + pincode + "]";
	}

}
