package com.xworkz.spring.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
@Getter

public class BusStopBean {

	private String name;
	private String place;
	private double area;
	private int noOfPlatforms;
	private boolean toilets;
	private boolean hotel;
	private boolean chats;
	private int noOfSeats;
	private int noOfBus;
	private int noOfEmployees;
	private boolean enquiry;
	private boolean announcement;
	private long pincode;
	private double rating;

	public BusStopBean(@Value("Majestic") String name, @Value("Bangalore") String place, @Value("400") double area,
			@Value("10") int noOfPlatforms, @Value("true") boolean toilets, @Value("true") boolean hotel,
			@Value("true") boolean chats, @Value("20") int noOfSeats, @Value("100") int noOfBus,
			@Value("15") int noOfEmployees, @Value("true") boolean enquiry, @Value("true") boolean announcement,
			@Value("560050") long pincode, @Value("4.0") double rating) {
		this.name = name;
		this.place = place;
		this.area = area;
		this.pincode = pincode;
		this.noOfPlatforms = noOfPlatforms;
		this.toilets = toilets;
		this.hotel = hotel;
		this.chats = chats;
		this.noOfSeats = noOfSeats;
		this.noOfBus = noOfBus;
		this.noOfEmployees = noOfEmployees;
		this.enquiry = enquiry;
		this.announcement = announcement;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "BusStopBean [name=" + name + ", place=" + place + ", area=" + area + ", noOfPlatforms=" + noOfPlatforms
				+ ", toilets=" + toilets + ", hotel=" + hotel + ", chats=" + chats + ", noOfSeats=" + noOfSeats
				+ ", noOfBus=" + noOfBus + ", noOfEmployees=" + noOfEmployees + ", enquiry=" + enquiry
				+ ", announcement=" + announcement + ", pincode=" + pincode + ", rating=" + rating + "]";
	}

}
