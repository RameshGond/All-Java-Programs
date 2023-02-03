package com.xworkz.waterpark;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import com.xworkz.waterpark.dto.WaterParkDTO;

public class WaterParkDTORunner {

	public static void main(String[] args) {
		WaterParkDTO park = new WaterParkDTO("Water World", "j.c.nagar", 750d, LocalTime.of(11, 00), "Bengaluru");
		WaterParkDTO park1 = new WaterParkDTO("GRS Fantasy Park", "Mysore", 645d, LocalTime.of(10, 30), "Bengaluru");
		WaterParkDTO park2 = new WaterParkDTO("Funtasia Island", "Patna", 350d, LocalTime.of(11, 00), "Bihar");
		WaterParkDTO park3 = new WaterParkDTO("Nicco Park", "Kolkata", 850d, LocalTime.of(9, 00), "West Bengal");
		WaterParkDTO park4 = new WaterParkDTO("Essel World", "Mumbai", 1170d, LocalTime.of(11, 30), "Maharastra");
		WaterParkDTO park5 = new WaterParkDTO("Fun 'n' Food Village", "Gurgaon", 1000d, LocalTime.of(8, 45), "Delhi");
		WaterParkDTO park6 = new WaterParkDTO("Magic Mountain", "Pune", 750d, LocalTime.of(10, 15), "Maharastra");
		WaterParkDTO park7 = new WaterParkDTO("Ocean World", "Bhubneswar", 350d, LocalTime.of(10, 25), "Odissa");
		WaterParkDTO park8 = new WaterParkDTO("Nellore Water World", "Golagamudi", 950d, LocalTime.of(11, 45),
				"Andhra Pradesh");
		WaterParkDTO park9 = new WaterParkDTO("Queensland Amusement Park", "Chennai", 650d, LocalTime.of(9, 30),
				"Tamilnadu");

		/*
		 * List<WaterParkDTO> waterParkDTO = new LinkedList<WaterParkDTO>();
		 * waterParkDTO.add(park); waterParkDTO.add(park1); waterParkDTO.add(park2);
		 * waterParkDTO.add(park3); waterParkDTO.add(park4); waterParkDTO.add(park5);
		 * waterParkDTO.add(park6); waterParkDTO.add(park7); waterParkDTO.add(park8);
		 * waterParkDTO.add(park9);
		 * 
		 * System.out.
		 * println("*********************find by assending order********************");
		 * waterParkDTO.stream().sorted().forEach(r -> System.out.println(r));
		 */

		List<WaterParkDTO> water = Arrays.asList(park, park1, park2, park3, park4, park5, park6, park7, park8, park9);
		water.stream().sorted().forEach(r -> System.out.println(r));

		System.out.println("***************Forword Direction*****************");
		ListIterator<WaterParkDTO> water1 = water.listIterator();
		while (water1.hasNext()) {
			System.out.println(water1.next());
		}
		System.out.println("******************Backword Direction******************");
		ListIterator<WaterParkDTO> water2 = water.listIterator(2);
		while (water1.hasPrevious()) {
			System.out.println(water1.previous());
		}

	}
}
