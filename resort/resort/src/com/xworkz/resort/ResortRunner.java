package com.xworkz.resort;

import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.resort.dao.ResortDAO;
import com.xworkz.resort.dao.ResortDAOImpl;
import com.xworkz.resort.entity.ResortEntity;

public class ResortRunner {

	public static void main(String[] args) {
		ResortEntity resort = new ResortEntity();
		resort.setId(0);
		resort.setName("JetShankar resort");
		resort.setLocation("Davanagere");
		resort.setCheckInTime(LocalTime.now());
		resort.setCheckOutTime(LocalTime.of(11, 30));
		resort.setCreatedBy("Sanju");
		resort.setCreatedDate(LocalDate.now());
		resort.setUpdatedBy("Sanjay");
		resort.setUpdatedDate(LocalDate.now());
		resort.setOwner("Rammi");
		resort.setPricePerDay(1000D);

		ResortDAO resortDAO = new ResortDAOImpl();
		boolean saved = resortDAO.save(resort);
		System.out.println("Saved " + saved);

	}

}
