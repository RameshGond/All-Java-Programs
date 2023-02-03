package com.xworkz.fw.beans;

public class SkeletonBean {
	public SkeletonBean() {
		System.out.println("created skeleton " + this.getClass().getSimpleName());
	}

	public void support() {
		System.out.println("skeleton is used to support");

	}

}
