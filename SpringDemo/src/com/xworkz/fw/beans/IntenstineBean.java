package com.xworkz.fw.beans;

public class IntenstineBean {
	public IntenstineBean() {
		System.out.println("created intenstine " + this.getClass().getSimpleName());
	}

	public void digest() {
		System.out.println("intenstine is used to digest");

	}
}
