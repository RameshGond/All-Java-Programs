package com.xworkz.fw.beans;

public class MouthBean {
	public MouthBean() {
		System.out.println("created mouth " + this.getClass().getSimpleName());
	}

	public void speak() {
		System.out.println("mouth is used to speak");

	}

}
