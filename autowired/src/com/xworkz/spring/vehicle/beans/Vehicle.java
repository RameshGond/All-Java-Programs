package com.xworkz.spring.vehicle.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
@Getter
public class Vehicle {
	@Value("4 Wheeler")
	private String type;
	@Value("Tata")
	private String company;
	@Value("White")
	private String color;
	@Value("9.0")
	private double price;
	@Value("123456")
	private long chassiNo;
	@Value("250.0")
	private double weight;
	@Value("true")
	private boolean ac;
	@Value("800")
	private int hp;
	@Value("2022")
	private int model;
	@Value("true")
	private boolean insuarance;
	@Value("true")
	private boolean powerStaring;
	@Value("false")
	private boolean autoTransmission;
	@Value("false")
	private boolean gps;
	@Value("100.0")
	private double fuelTankCapacity;
	@Value("true")
	private boolean musicSystem;
	@Value("4")
	private int noOfSpeakers;
	@Value("5")
	private int noOfSeats;
	@Value("true")
	private boolean airBags;
	@Value("2")
	private int noOfAirBags;
	@Value("KA")
	private String regState;
	@Value("true")
	private boolean allIndiaPermit;
	@Value("YellowBoard")
	private String boardType;
	@Value("Sanju")
	private String ownerName;
	@Value("987654321")
	private long ownerContNo;
	@Value("true")
	private boolean bluetooth;
	@Autowired
	private EngineBean engineBean;
	@Autowired
	private WheelBean wheelBean;
	@Autowired
	private BatteryBean batteryBean;
	@Autowired
	private MirrorBean mirrorBean;
	@Autowired
	private SeatBean seatBean;
	@Autowired
	private DoorBean doorBean;
	@Autowired
	private HeadLightBean headLightBean;
	@Autowired
	private CarGlassBean carGlassBean;

	public void travelling() {
		System.out.println("Calling travelling from Vehicle");
	}

	@Override
	public String toString() {
		return "Vehicle [type=" + type + ", company=" + company + ", color=" + color + ", price=" + price
				+ ", chassiNo=" + chassiNo + ", weight=" + weight + ", ac=" + ac + ", hp=" + hp + ", model=" + model
				+ ", insuarance=" + insuarance + ", powerStaring=" + powerStaring + ", autoTransmission="
				+ autoTransmission + ", gps=" + gps + ", fuelTankCapacity=" + fuelTankCapacity + ", musicSystem="
				+ musicSystem + ", noOfSpeakers=" + noOfSpeakers + ", noOfSeats=" + noOfSeats + ", airBags=" + airBags
				+ ", noOfAirBags=" + noOfAirBags + ", regState=" + regState + ", allIndiaPermit=" + allIndiaPermit
				+ ", boardType=" + boardType + ", ownerName=" + ownerName + ", ownerContNo=" + ownerContNo
				+ ", bluetooth=" + bluetooth + ", engineBean=" + engineBean + ", wheelBean=" + wheelBean
				+ ", batteryBean=" + batteryBean + ", mirrorBean=" + mirrorBean + ", seatBean=" + seatBean
				+ ", doorBean=" + doorBean + ", headLightBean=" + headLightBean + ", carGlassBean=" + carGlassBean
				+ "]";
	}

}
