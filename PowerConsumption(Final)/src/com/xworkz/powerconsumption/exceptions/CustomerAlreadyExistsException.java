package com.xworkz.powerconsumption.exceptions;

public class CustomerAlreadyExistsException extends RuntimeException {

	public CustomerAlreadyExistsException() {

	}

	public CustomerAlreadyExistsException(String msge) {
		super(msge);
	}

}
