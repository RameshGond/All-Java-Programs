package com.xworkz.watertank.dao;

import com.xworkz.watertank.dto.WaterTankDTO;

public class WaterTankDAO {
	
	private WaterTankDTO[] dtos=new WaterTankDTO[5];
	private int index;

	public boolean save(WaterTankDTO dto)
	{
		System.out.println("storing "+dto);
		if(index<this.dtos.length) {
			this.dtos[0]=dto;
			index++;
			System.out.println("dto is added");
			return true;
		}
		else
		{
			System.out.println("dto is not added");
		}
		return false;
	}
	
			

}
