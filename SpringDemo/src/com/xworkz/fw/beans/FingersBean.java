package com.xworkz.fw.beans;

public class FingersBean {
	public FingersBean() {
		System.out.println("created finger " + this.getClass().getSimpleName());
	}

	public void write() {
		System.out.println("finger is used to write");

	}

}
