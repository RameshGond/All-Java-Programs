package com.xworkz.tree.functions;

public class AbstractMangoTree extends AbstractTree {

	public AbstractMangoTree(String name, Double height) {
		super(name, height);
		
	}

	@Override
	public void furniture() {
		System.out.println("we can make furniture using tree");
		
	}

	@Override
	public void makingFood() {
     System.out.println("running food");		
	}
	
	

}
