package com.xworkz.toothpaste.exceptions;

public class LimittedToothPasteIsOverException extends RuntimeException {
	public  LimittedToothPasteIsOverException() {
		
	}
	public LimittedToothPasteIsOverException(String msge)
	{
		super(msge);
	}

}
