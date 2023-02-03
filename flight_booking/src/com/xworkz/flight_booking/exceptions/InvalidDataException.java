package com.xworkz.flight_booking.exceptions;

public class InvalidDataException extends Exception {
	
	public InvalidDataException() {
		System.out.println("calling constructor");
	}
	
	public InvalidDataException(String msg) {
		super(msg);
	}

}
