package com.xworkz.military.selection;

public class MilitaryRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MilitaryRule rule = new MilitaryImpl();
		Double height = rule.minHeight();    
		Boolean ref = rule.fitness();

		System.out.println(height);
		System.out.println(ref);


	}

}
