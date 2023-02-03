package com.xworkz.watertank;

import com.xworkz.watertank.dao.WaterTankDAO;
import com.xworkz.watertank.dto.WaterTankDTO;

public class WaterTankRunner {

	public static void main(String[] args) {
		
		WaterTankDTO waterTank=new WaterTankDTO();
		waterTank.setCapacity(1000);
		waterTank.setColor("black");
		waterTank.setBrand("SUPREME");
		waterTank.setPrice(5500d);
		waterTank.setWarrenty(10);
		
		System.out.println(waterTank); // fully qualify name from toString
		System.out.println(waterTank.hashCode());

		
		WaterTankDAO waterTankDAO=new WaterTankDAO();
		System.out.println("hash code of dto from main method "+waterTank.hashCode());
		boolean saved=waterTankDAO.save(waterTank);
		System.out.println(saved);
		
		WaterTankDTO waterTank2=new WaterTankDTO();
		waterTank2.setCapacity(7000);
		waterTank2.setColor("PINK");
		waterTank2.setBrand("ASHIRVAD");
		waterTank2.setPrice(5600d);
		waterTank2.setWarrenty(9);
		
		 saved=waterTankDAO.save(waterTank2);
		
		 WaterTankDTO waterTank3=new WaterTankDTO();
			waterTank3.setCapacity(12000);
			waterTank3.setColor("BLUE");
			waterTank3.setBrand("OCEAN");
			waterTank3.setPrice(4600d);
			waterTank3.setWarrenty(7);
			
			 saved=waterTankDAO.save(waterTank3);
			
		 WaterTankDTO waterTank4=new WaterTankDTO();
			waterTank4.setCapacity(2000);
			waterTank4.setColor("WHITE");
			waterTank4.setBrand("SYNTAX");
			waterTank4.setPrice(5600d);
			waterTank4.setWarrenty(12);
				
			 saved=waterTankDAO.save(waterTank4);
				
		 WaterTankDTO waterTank5=new WaterTankDTO();
			waterTank5.setCapacity(3000);
			waterTank5.setColor("RED");
			waterTank5.setBrand("AQUA TECH");
			waterTank5.setPrice(7600d);
			waterTank5.setWarrenty(3);
					
			 saved=waterTankDAO.save(waterTank5);
					
		 WaterTankDTO waterTank6=new WaterTankDTO();
			waterTank6.setCapacity(500);
			waterTank6.setColor("YELLOW");
			waterTank6.setBrand("STOREWEL");
			waterTank6.setPrice(6600d);
			waterTank6.setWarrenty(5);
						
			 saved=waterTankDAO.save(waterTank6);
						
	}

}
