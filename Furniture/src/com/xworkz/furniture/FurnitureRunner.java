package com.xworkz.furniture;

import com.xworkz.furniture.constants.Material;
import com.xworkz.furniture.dao.FurnitureDAO;
import com.xworkz.furniture.dto.FurnitureDTO;

public class FurnitureRunner {

	public static void main(String[] args) {

		FurnitureDTO furniture=new FurnitureDTO();
		furniture.setId(1);
		furniture.setName("chair");
		furniture.setPrice(455.0);
		furniture.setBrand("cello");
		furniture.setWeight(2.0);
		furniture.setMaterial(Material.BAMBOO);
		
		FurnitureDAO dao=new FurnitureDAO();
		boolean save=dao.save(furniture);
		System.out.println(save);
		
		FurnitureDTO furniture1=new FurnitureDTO();
		furniture1.setId(1);
		furniture1.setName("sofa");
		furniture1.setPrice(11455.0);
		furniture1.setBrand("satya");
		furniture1.setWeight(80.0);
		furniture1.setMaterial(Material.FIBER);
		
		save=dao.save(furniture1);
		System.out.println(save);
		
		FurnitureDTO furniture2=new FurnitureDTO();
		furniture2.setId(2);
		furniture2.setName("table");
		furniture2.setPrice(200.0);
		furniture2.setBrand("supreme");
		furniture2.setWeight(3.0);
		furniture2.setMaterial(Material.WOOD);
		
		save=dao.save(furniture2);
		System.out.println(save);
		
		FurnitureDTO furniture3=new FurnitureDTO();
		furniture3.setId(3);
		furniture3.setName("Dining tables");
		furniture3.setPrice(4500.0);
		furniture3.setBrand("ramesh");
		furniture3.setWeight(95.0);
		furniture3.setMaterial(Material.STEEL);
		
		save=dao.save(furniture3);
		System.out.println(save);
		
		FurnitureDTO furniture4=new FurnitureDTO();
		furniture4.setId(4);
		furniture4.setName("Bookcases");
		furniture4.setPrice(2255.0);
		furniture4.setBrand("sai");
		furniture4.setWeight(50.0);
		furniture4.setMaterial(Material.RUBBER);
		
		save=dao.save(furniture4);
		System.out.println(save);
		
		FurnitureDTO furniture5=new FurnitureDTO();
		furniture5.setId(5);
		furniture5.setName("Storage cabinets");
		furniture5.setPrice(2255.0);
		furniture5.setBrand("sanjay");
		furniture5.setWeight(150.0);
		furniture5.setMaterial(Material.IRON);
		
		save=dao.save(furniture5);
		System.out.println(save);
		
		
		
	}

}
