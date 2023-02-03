package com.xworkz.gadget;

import java.time.LocalDate;

import com.xworkz.gadget.dao.GadgetDAO;
import com.xworkz.gadget.dao.GadgetDAOImpl;
import com.xworkz.gadget.dto.GadgetDTO;
import com.xworkz.service.GadgetService;
import com.xworkz.service.GadgetServiceImpl;

public class GadgetRunner {

	public static void main(String[] args) {
		GadgetDTO dto = new GadgetDTO(0, "Mobile", "Iphone", 60D, "Apple", LocalDate.of(2020, 6, 12), 5, 4, true,
				20205364, "Apple", LocalDate.of(2020, 1, 25), "Satya", LocalDate.of(2022, 06, 26));

		GadgetDTO dto1 = new GadgetDTO(0, "Bike", "Duke", 70D, "Duke", LocalDate.of(2021, 6, 12), 6, 5, false, 30205361,
				"Apple", LocalDate.of(2021, 1, 27), "Nikhil", LocalDate.of(2022, 06, 25));

		GadgetDTO dto2 = new GadgetDTO(0, "Laptop", "Hp", 50D, "Hp", LocalDate.of(2022, 6, 12), 6, 5, true, 40278364,
				"Lapi", LocalDate.of(2022, 1, 25), "Rajesh", LocalDate.of(2022, 06, 24));

		GadgetDAO dao = new GadgetDAOImpl();

		GadgetService service =new GadgetServiceImpl(dao);

		System.out.println("*****************save*********************");

		dao.save(dto);
		dao.save(dto1);
		dao.save(dto2);

		System.out.println("**********************findById****************");

		GadgetDTO id = service.findById(1);
		System.out.println(id);
		
		

	}

}
