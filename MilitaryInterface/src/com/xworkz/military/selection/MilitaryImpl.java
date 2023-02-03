package com.xworkz.military.selection;

public class MilitaryImpl implements MilitaryRule {
	
	@Override
	public double minHeight() {
		System.out.println("running height");
		return 157.6;
	}
	@Override
	public boolean fitness() {
		System.out.println("running fitness");
		return true;
	}
	

}
