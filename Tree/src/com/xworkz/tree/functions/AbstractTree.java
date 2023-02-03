package com.xworkz.tree.functions;

public abstract class AbstractTree {
	
	private String name;
	private Double height;
	private Integer life;
	private Integer noOfTree;
	
	public AbstractTree(String name, Double height) {
		super();
		this.name = name;
		this.height = height;
	}
	public void treeMethod(Integer life,Integer noOfTree) {
		this.life=life;
		this.noOfTree=noOfTree;
	}
	public abstract void furniture();
	/*{
		System.out.println("running furniture");
	}*/
	public abstract void makingFood();
	/*{
		System.out.println("running making food");
	}*/
	public void medicine()
	{
		System.out.println("running medicine");
	}
	public void gettingOxygen()
	{
		System.out.println("running oxygen");
	}
	public void gettingFruits()
	{
		System.out.println("running fruits");
	}
	public String getName() {
		return name;
	}
	public Double getHeight() {
		return height;
	}
	public Integer getLife() {
		return life;
	}
	public Integer getNoOfTree() {
		return noOfTree;
	}
	
	

}
