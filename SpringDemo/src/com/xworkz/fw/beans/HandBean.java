package com.xworkz.fw.beans;

public class HandBean {
	public HandBean() {
		System.out.println("created hand " + this.getClass().getSimpleName());
	}

	public void eat() {
		System.out.println("hand is used to eat");

	}

}
