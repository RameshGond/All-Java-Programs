package com.xworkz.toothpaste;

import java.time.LocalDate;

import com.xworkz.toothpaste.constants.Color;
import com.xworkz.toothpaste.constants.QuantityInGms;
import com.xworkz.toothpaste.dao.ToothPasteDAO;
import com.xworkz.toothpaste.dto.ToothPasteDTO;
import com.xworkz.toothpaste.exceptions.LimittedToothPasteIsOverException;
import com.xworkz.toothpaste.service.ToothPasteService;

public class ToothPasteRunner {

	public static void main(String[] args) {
		
		ToothPasteDTO toothPaste=new ToothPasteDTO();
		toothPaste.setId(1);
		toothPaste.setBrand("colgate");
		toothPaste.setColor(Color.BLACK);
		toothPaste.setMfgDate(LocalDate.of(2022, 01, 01));
		toothPaste.setExpiryDate(LocalDate.of(2023, 01, 01));
		toothPaste.setPrice(125.0);
		toothPaste.setQuantityInGms(QuantityInGms.ONEHUNDRED_GMS);
		
		
		ToothPasteDTO toothPaste1=new ToothPasteDTO();
		toothPaste1.setId(2);
		toothPaste1.setBrand("oral-B");
		toothPaste1.setColor(Color.GREEN);
		toothPaste1.setMfgDate(LocalDate.of(2022, 03, 12));
		toothPaste1.setExpiryDate(LocalDate.of(2023, 01, 12));
		toothPaste1.setPrice(117.0);
		toothPaste1.setQuantityInGms(QuantityInGms.TWOHUNDRED_GMS);
		
		
		ToothPasteDTO toothPaste2=new ToothPasteDTO();
		toothPaste2.setId(3);
		toothPaste2.setBrand("aquafresh");
		toothPaste2.setColor(Color.PINK);
		toothPaste2.setMfgDate(LocalDate.of(2022, 01, 01));
		toothPaste2.setExpiryDate(LocalDate.of(2023, 01, 01));
		toothPaste2.setPrice(509.0);
		toothPaste2.setQuantityInGms(QuantityInGms.THREEHUNDRED_GMS);
		

		
		ToothPasteDTO toothPaste3=new ToothPasteDTO();
		toothPaste3.setId(4);
		toothPaste3.setBrand("max");
		toothPaste3.setColor(Color.RED);
		toothPaste3.setMfgDate(LocalDate.of(2021, 11, 01));
		toothPaste3.setExpiryDate(LocalDate.of(2023, 01, 01));
		toothPaste3.setPrice(425.0);
		toothPaste3.setQuantityInGms(QuantityInGms.TWOHUNDRED_GMS);
		

		
		ToothPasteDTO toothPaste4=new ToothPasteDTO();
		toothPaste4.setId(5);
		toothPaste4.setBrand("pepsodent");
		toothPaste4.setColor(Color.WHITE);
		toothPaste4.setMfgDate(LocalDate.of(2021, 12, 01));
		toothPaste4.setExpiryDate(LocalDate.of(2022, 12, 01));
		toothPaste4.setPrice(109.0);
		toothPaste4.setQuantityInGms(QuantityInGms.FIFTY_GMS);
		

		
		ToothPasteDTO toothPaste5=new ToothPasteDTO();
		toothPaste5.setId(6);
		toothPaste5.setBrand("sensodyne");
		toothPaste5.setColor(Color.BLUE);
		toothPaste5.setMfgDate(LocalDate.of(2021, 01, 01));
		toothPaste5.setExpiryDate(LocalDate.of(2023, 01, 01));
		toothPaste5.setPrice(225.0);
		toothPaste5.setQuantityInGms(QuantityInGms.ONEHUNDRED_GMS);
		
	
		ToothPasteService service = new ToothPasteService();
		try {
			
		service.validateAndSave(toothPaste);
		service.validateAndSave(toothPaste1);
		service.validateAndSave(null);
		service.validateAndSave(toothPaste3);
		service.validateAndSave(toothPaste4);
		}
		catch(LimittedToothPasteIsOverException e){
			e.equals(e);
			{
				System.out.println("running equals");
			}
			System.out.println("hashCode is "+e.hashCode());
			System.out.println("localizeMassage is "+e.getLocalizedMessage());
			System.out.println("class is "+e.getClass());
			System.out.println("cause is "+e.getCause());
			System.out.println("stackTrace is "+e.getStackTrace());
			System.out.println("fillInStackeTrace is "+e.fillInStackTrace());
			System.out.println("suppressed is "+e.getSuppressed());
			e.notify();
			{
				System.out.println("runing notify");
			}
			e.notifyAll();
			{
				System.out.println("running notifyAll");
			}
			e.printStackTrace();
			{
				System.out.println("running printStack");
			}
		}

	}

}
