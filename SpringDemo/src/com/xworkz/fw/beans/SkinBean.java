package com.xworkz.fw.beans;

public class SkinBean {
	public SkinBean() {
		System.out.println("created skin" + this.getClass().getSimpleName());
	}

	public void protect() {
		System.out.println("skin is used to protect");

	}

}
