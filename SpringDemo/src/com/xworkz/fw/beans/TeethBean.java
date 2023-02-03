package com.xworkz.fw.beans;

public class TeethBean {
	public TeethBean() {
		System.out.println("created teeth" + this.getClass().getSimpleName());
	}

	public void cut() {
		System.out.println("teeth is used to cut");

	}

}
