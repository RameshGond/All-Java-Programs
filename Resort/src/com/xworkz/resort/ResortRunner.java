package com.xworkz.resort;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.resort.dao.ResortDAO;
import com.xworkz.resort.dao.ResortDAOImpl;
import com.xworkz.resort.dto.ResortDTO;

public class ResortRunner {

	public static void main(String[] args) {
		ResortDTO resortDTO = new ResortDTO(2, "Satya Resort", "Ramesh", "BTM", 1500D, 9, LocalTime.of(8, 30),
				LocalTime.of(6, 30), 34, "Ramesh", 25, 11, true, 55, 2, 9, 41, true, "Karnataka", "India", 4.5D, 4,
				10.5D, true, 510, 54, true, true, true, "Neem", 25, true, false, "Swimming", "gst12345", true, false,
				true, false, LocalDate.of(2000, 01, 01), "Patel", LocalDate.of(2022, 06, 22), "Satya");

		ResortDTO resortDTO3 = new ResortDTO(3, "Nikhil Resort", "Rajesh", "ODP", 1400D, 10, LocalTime.of(10, 30),
				LocalTime.of(7, 30), 35, "Amar", 26, 12, false, 60, 3, 10, 31, false, "Karnataka", "India", 5.5D, 6,
				12.5D, true, 610, 55, false, true, false, "Ashok", 26, false, true, "Running", "gst12346", false, true,
				true, false, LocalDate.of(2001, 01, 01), "Pami", LocalDate.of(2022, 06, 22), "Satyajeet");

		ResortDTO resortDTO4 = new ResortDTO(0, "RRR Resort", "Raghu", "Danapur", 1600D, 12, LocalTime.of(7, 30),
				LocalTime.of(5, 30), 34, "Suresh", 20, 14, false, 59, 5, 19, 81, true, "Bihar", "India", 7.5D, 3, 17.5D,
				true, 710, 50, false, true, true, "Banyan", 23, false, false, "Singing", "gst215449", true, false, true,
				false, LocalDate.of(1900, 05, 05), "Sweta", LocalDate.of(2022, 06, 22), "Rajesh");

		ResortDTO resortDTO5 = new ResortDTO(5, "Chandan Resort", "priya", "Kankarbagh", 2500D, 7, LocalTime.of(5, 30),
				LocalTime.of(6, 30), 39, "Suman", 27, 13, false, 65, 7, 19, 61, false, "Patna", "India", 8.5D, 6, 18.5D,
				true, 910, 54, true, true, true, "Banana", 21, false, true, "Dancing", "gst789445", false, true, false,
				true, LocalDate.of(1995, 8, 12), "Kaju", LocalDate.of(2022, 06, 22), "Punit");

		// ResortDTO dto = new ResortDTO();
		ResortDAO dao = new ResortDAOImpl();
		// boolean result = dao.save(resortDTO5);

		System.out.println("***************updatePriceByName(String name ,double price)********************");
		dao.updatePriceByName("Satya Resort", 2500);

		System.out.println("**********updateReceptionistNameById**************");
		dao.updateReceptionistNameById("Archana", 5);

		System.out.println("********updatePriceAndRatingByName*********************");
		dao.updatePriceAndRatingByName("Satya resort", 8, 2000d);

		System.out.println("*******getById**************");
		ResortDTO resort = dao.getById(5);
		System.out.println(resort);

		System.out.println("*******getByName**************");
		ResortDTO resort1 = dao.getByName("Chandan Resort");
		System.out.println(resort1);

		System.out.println("*******getByNameAndLocation**************");
		ResortDTO resort2 = dao.getByNameAndLocation("Satya Resort", "BTM");
		System.out.println(resort2);

		System.out.println("*******getByNameAndLocationAndOwnerName**************");
		ResortDTO resort3 = dao.getByNameAndLocationAndOwnerName("Satya Resort", "BTM", "Ramesh");
		System.out.println(resort3);

		System.out.println("****************getCheakByName**********************");
		LocalTime resort4 = dao.getCheckInTimeByName("Nikhil Resort");
		System.out.println(resort4);

		System.out.println("**************getTotalRows***********************");
		dao.getTotalRows();

		System.out.println("*********************getByMaxPrice******************");
		// ResortDTO max=dao.getByMaxPrice();
		// System.out.println(max);
		System.out.println(dao.getByMaxPrice());
		System.out.println("******************getByMinPice********************");
		System.out.println(dao.getByMinPrice());
		
		Collection<ResortDTO> dto=new ArrayList<ResortDTO>();
		dto.add(resortDTO4);
        dao.save(dto);
        
	}

}
