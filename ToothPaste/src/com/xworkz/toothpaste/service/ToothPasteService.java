package com.xworkz.toothpaste.service;

import java.time.LocalDate;

import com.xworkz.toothpaste.constants.Color;
import com.xworkz.toothpaste.constants.QuantityInGms;
import com.xworkz.toothpaste.dao.ToothPasteDAO;
import com.xworkz.toothpaste.dto.ToothPasteDTO;
import com.xworkz.toothpaste.exceptions.LimittedToothPasteIsOverException;

public class ToothPasteService {
	
	private ToothPasteDAO pasteDAO=new ToothPasteDAO();
	
	public boolean validateAndSave(ToothPasteDTO dto) throws LimittedToothPasteIsOverException
	{
		if(dto !=null)
		{
			Integer id=dto.getId();
			if(id !=null && id>0)
			{
				System.out.println("valid id");
			}
			else 
			{
				System.out.println("not valid id");
			LimittedToothPasteIsOverException limited=new LimittedToothPasteIsOverException("ID is invalid please enter valid ID");
			throw limited;
			}
			String brand=dto.getBrand();
			if(brand !=null)
			{
				System.out.println("valid brand");
			}
			else
			{
				System.out.println("not valid brand");
				LimittedToothPasteIsOverException limited=new LimittedToothPasteIsOverException("brand is invalid please enter valid brand");
				throw limited;
				}
			Double price=dto.getPrice();
			if(price !=null && price>0)
			{
				System.out.println("valid price");
			}
			else
			{
				System.out.println("not valid price");
				LimittedToothPasteIsOverException limited=new LimittedToothPasteIsOverException("price is invalid please enter valid price");
				throw limited;
				}
			LocalDate mfgDate=dto.getMfgDate();
			if(mfgDate !=null)
			{
				System.out.println("valid mfgDate ");
			}
			else
			{
				System.out.println("not valid mfgDate");
				LimittedToothPasteIsOverException limited=new LimittedToothPasteIsOverException("mfgDate is invalid please enter valid mfgDate");
				throw limited;
				}
			LocalDate expiryDate=dto.getExpiryDate();
			if(expiryDate !=null)
			{
				System.out.println("valid expiryDate ");
			}
			else
			{
				System.out.println("not valid expiryDate");
				LimittedToothPasteIsOverException limited=new LimittedToothPasteIsOverException("expiryDate is invalid please enter valid expiryDate");
				throw limited;
				}
			 Color color=dto.getColor();
			if(color !=null)
			{
				System.out.println("valid color ");
			}
			else
			{
				System.out.println("not valid color");
				LimittedToothPasteIsOverException limited=new LimittedToothPasteIsOverException("color is invalid please enter valid color");
				throw limited;
				}
			QuantityInGms quantityInGms=dto.getQuantityInGms();
				if(quantityInGms !=null)
				{
					System.out.println("valid quantityInGms ");
				}
				else
				{
					System.out.println("not valid quantityInGms");
					LimittedToothPasteIsOverException limited=new LimittedToothPasteIsOverException("quantityInGms is invalid please enter valid quantityInGms");
					throw limited;
					}
				
			
			
			
			System.out.println("toothpaste is valid and save");
			boolean saved=pasteDAO.save(dto);
			System.out.println(saved);
			return true;
		}
		else
		{
			System.err.println("toothpaste is not valid");
			LimittedToothPasteIsOverException limited=new LimittedToothPasteIsOverException("data enter is invalid please enter valid data");
			throw limited;
		}
	}

}
