package com.xworkz.tree;

import com.xworkz.tree.functions.AbstractMangoTree;
import com.xworkz.tree.functions.AbstractTree;

public class TreeRunner {

	public static void main(String[] args) {
	
		AbstractTree abstractTree=new AbstractMangoTree("Mango",15d);
		abstractTree.treeMethod(100, 1000);
		System.out.println("Tree name is " + abstractTree.getName());
		System.out.println("Tree height is " + abstractTree.getHeight());
		System.out.println("Tree LIFE is " + abstractTree.getLife());
		System.out.println("Tree height is " + abstractTree.getNoOfTree());
		
		abstractTree.gettingFruits();
		abstractTree.gettingOxygen();
		abstractTree.furniture();
		abstractTree.makingFood();
		
		System.out.println("**************************");
		
		AbstractTree abstractTree1=new AbstractMangoTree("Apple",15.5d);
		abstractTree1.treeMethod(90, 120);
		System.out.println("Tree name is " + abstractTree1.getName());
		System.out.println("Tree height is " + abstractTree1.getHeight());
		System.out.println("Tree LIFE is " + abstractTree1.getLife());
		System.out.println("Tree height is " + abstractTree1.getNoOfTree());
		
		abstractTree1.gettingFruits();
		abstractTree1.gettingOxygen();
		abstractTree1.furniture();
		abstractTree1.makingFood();
		
		
		System.out.println("********************************");
		
		AbstractTree abstractTree2=new AbstractMangoTree("neem",10.5d);
		abstractTree2.treeMethod(150, 500);
		System.out.println("Tree name is "+ abstractTree2.getName());
		System.out.println("Tree height is " + abstractTree2.getHeight());
		System.out.println("Tree LIFE is " + abstractTree2.getLife());
		System.out.println("Tree height is " + abstractTree2.getNoOfTree());
		
		abstractTree2.gettingFruits();
		abstractTree2.gettingOxygen();
		abstractTree2.furniture();
		abstractTree2.makingFood();
		
		System.out.println("**************************");
		

	}

}
