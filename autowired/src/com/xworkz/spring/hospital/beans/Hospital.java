package com.xworkz.spring.hospital.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
@Getter

public class Hospital {

	@Value("LifeLine")
	private String name;

	@Value("Hubli")
	private String place;

	@Value("Gokul Road")
	private String address;

	@Value("MultiSpeciality")
	private String type;

	@Value("3000")
	private int builtUpArea;

	@Value("9:00 to 6:00")
	private String casualtyTimings;

	@Value("25")
	private int totalRooms;

	@Value("500")
	private int generalFees;

	@Value("600")
	private short bloodTestFees;

	@Value("3")
	private int OperationTheatres;

	@Value("5")
	private int generalWards;

	@Value("4")
	private byte Laboratories;

	@Value("true")
	private boolean scanning;

	@Value("true")
	private boolean bloodTest;

	@Value("true")
	private boolean medicalCollege;

	@Value("3")
	private int noOfLift;

	@Value("50")
	private int noOfBeds;

	@Value("100")
	private int noOfPatients;

	@Value("50")
	private int noOfNurses;

	@Value("10")
	private int noOfDutyDoctors;

	@Value("5")
	private int noOfSurgeon;

	@Value("3")
	private int noOfSecurity;

	@Value("4")
	private int noOfAmbulance;

	@Value("4.8F")
	private float rating;

	@Value("08267-682362")
	private String contactNo;

	@Autowired
	private Ac ac;
	@Autowired
	private Ambulance ambulance;
	@Autowired
	private Bed bed;
	@Autowired
	private Chair chair;
	@Autowired
	private Cot cot;
	@Autowired
	private Cotton cotton;
	@Autowired
	private Curton curton;
	@Autowired
	private Door door;
	@Autowired
	private Elevator elevator;
	@Autowired
	private Fan fan;
	@Autowired
	private Knife knife;
	@Autowired
	private Land land;
	@Autowired
	private Light light;
	@Autowired
	private Scissor scissor;
	@Autowired
	private Steps steps;
	@Autowired
	private Switch switches;
	@Autowired
	private Table table;
	@Autowired
	private Window window;

	@Override
	public String toString() {
		return "Hospital [name=" + name + ", place=" + place + ", address=" + address + ", type=" + type
				+ ", builtUpArea=" + builtUpArea + ", casualtyTimings=" + casualtyTimings + ", totalRooms=" + totalRooms
				+ ", generalFees=" + generalFees + ", bloodTestFees=" + bloodTestFees + ", OperationTheatres="
				+ OperationTheatres + ", generalWards=" + generalWards + ", Laboratories=" + Laboratories
				+ ", scanning=" + scanning + ", bloodTest=" + bloodTest + ", medicalCollege=" + medicalCollege
				+ ", noOfLift=" + noOfLift + ", noOfBeds=" + noOfBeds + ", noOfPatients=" + noOfPatients
				+ ", noOfNurses=" + noOfNurses + ", noOfDutyDoctors=" + noOfDutyDoctors + ", noOfSurgeon=" + noOfSurgeon
				+ ", noOfSecurity=" + noOfSecurity + ", noOfAmbulance=" + noOfAmbulance + ", rating=" + rating
				+ ", contactNo=" + contactNo + ", ac=" + ac + ", ambulance=" + ambulance + ", bed=" + bed + ", chair="
				+ chair + ", cot=" + cot + ", cotton=" + cotton + ", curton=" + curton + ", door=" + door
				+ ", elevator=" + elevator + ", fan=" + fan + ", knife=" + knife + ", land=" + land + ", light=" + light
				+ ", scissor=" + scissor + ", steps=" + steps + ", switches=" + switches + ", table=" + table
				+ ", window=" + window + "]";
	}

}
