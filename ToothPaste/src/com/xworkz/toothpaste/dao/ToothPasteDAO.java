package com.xworkz.toothpaste.dao;

import com.xworkz.toothpaste.dto.ToothPasteDTO;
import com.xworkz.toothpaste.exceptions.LimittedToothPasteIsOverException;

public class ToothPasteDAO {
	
	private ToothPasteDTO[] dtos=new ToothPasteDTO[5];
	private int index;
	
	public boolean save(ToothPasteDTO dto)
	{
		if(this.index < this.dtos.length)
		{
			this.dtos[index]=dto;
			index++;
			System.out.println(" new furniture added "+ dto + "at index "+ " index ");
			return true;
		}
		else
		{
			System.err.println("toothpaste is out of index");
			 LimittedToothPasteIsOverException limitted=new LimittedToothPasteIsOverException("toothpaste is not available");
			 throw limitted;
		}
	}

}
