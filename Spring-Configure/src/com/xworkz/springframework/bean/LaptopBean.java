package com.xworkz.springframework.bean;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class LaptopBean {

	
	private String name;
	private String brand;
	private Integer ram;
	private Integer memory;
	private Double  price;
	private double warranty;
	private double batteryWarranty;
    private float displaySize; 
    private boolean camera;
    private String modelNo;
    private Integer processor;
    private String storageType;
    private Boolean audioFeatures;
    private String keyboard;
    private Double batteryWeight;
	@Override
	public String toString() {
		return "LaptopBean [name=" + name + ", brand=" + brand + ", ram=" + ram + ", memory=" + memory + ", price="
				+ price + ", warranty=" + warranty + ", batteryWarranty=" + batteryWarranty + ", displaySize="
				+ displaySize + ", camera=" + camera + ", modelNo=" + modelNo + ", processor=" + processor
				+ ", storageType=" + storageType + ", audioFeatures=" + audioFeatures + ", keyboard=" + keyboard
				+ ", batteryWeight=" + batteryWeight + "]";
	}
    
	
}
