package com.xworkz.organs;

import java.util.HashSet;
import java.util.Set;

import com.xworkz.organs.dto.OrgansDTO;

public class OrgansRunner {

	public static void main(String[] args) {
		OrgansDTO organs1 = new OrgansDTO("Heart", "Pumps Blood", 150D, 10000D);
		OrgansDTO organs2 = new OrgansDTO("Eyes", "Seeing", 95D, 1000D);
		OrgansDTO organs3 = new OrgansDTO("Hands", "Write", 750D, 1999D);
		OrgansDTO organs4 = new OrgansDTO("Mouth", "Speak", 199D, 15000D);
		OrgansDTO organs5 = new OrgansDTO("Tounge", "Taste", 113D, 10098D);

		Set<OrgansDTO> organsDTO = new HashSet<OrgansDTO>();
		organsDTO.add(organs1);
		organsDTO.add(organs2);
		organsDTO.add(organs3);
		organsDTO.add(organs4);
		organsDTO.add(organs5);
		
		organsDTO.forEach(System.out::println);
		//organsDTO.stream().sorted(a1,a2)->a2.c
	}

}
