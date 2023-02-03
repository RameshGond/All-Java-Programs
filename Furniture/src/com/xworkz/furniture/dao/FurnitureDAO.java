package com.xworkz.furniture.dao;

import com.xworkz.furniture.dto.FurnitureDTO;
import com.xworkz.furniture.exceptions.LimittedFurnitureIsOverException;

public class FurnitureDAO {
	
	private FurnitureDTO[] dtos=new FurnitureDTO[5];
	private int index;
	
	public boolean save(FurnitureDTO dto)
	{
		if(this.index < this.dtos.length)
		{
			this.dtos[index]=dto;
			index++;
			
			System.out.println("new furniture added "+ dto +"at index"+index);
			return true;
	}
		else
		{
			System.err.println("furniture is out of index");
			LimittedFurnitureIsOverException limitted=new LimittedFurnitureIsOverException("Space is not available");
			throw limitted;
		}
		
	}
	

}
