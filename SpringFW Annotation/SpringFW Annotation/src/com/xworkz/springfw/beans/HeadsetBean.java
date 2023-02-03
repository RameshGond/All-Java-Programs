package com.xworkz.springfw.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
@Getter
public class HeadsetBean {

	private String name;
	private String modelName;
	private String colour;
	private String productDimension;
	private double price;
	private String headphoneJack;
	private double weight;
	private String noiseControl;
	private String cableFeature;
	private String connectorType;
	private String battery;
	private String compatibleDevice;
	private boolean microphone;
	private String formfactor;

	public HeadsetBean(@Value("OnePlus") String name, @Value("Rocker") String modelName, @Value("Black") String colour,
			@Value("8x18.2x17.6") String productDimension, @Value("2000.0") double price,
			@Value("Bluetooth") String headphoneJack, @Value("168.0") double weight,
			@Value("Sound Isolation") String noiseControl, @Value("Without cable") String cableFeature,
			@Value("wireless") String connectorType, @Value("320Mah Lithium") String battery,
			@Value("Android, IOS, windows") String compatibleDevice, @Value("Yes") boolean microphone,
			@Value("On Ear") String formfactor) {
		super();
		this.name = name;
		this.modelName = modelName;
		this.colour = colour;
		this.productDimension = productDimension;
		this.price = price;
		this.headphoneJack = headphoneJack;
		this.weight = weight;
		this.noiseControl = noiseControl;
		this.cableFeature = cableFeature;
		this.connectorType = connectorType;
		this.battery = battery;
		this.compatibleDevice = compatibleDevice;
		this.microphone = microphone;
		this.formfactor = formfactor;
	}

	@Override
	public String toString() {
		return "HeadsetBean [name=" + name + ", modelName=" + modelName + ", colour=" + colour + ", productDimension="
				+ productDimension + ", price=" + price + ", headphoneJack=" + headphoneJack + ", weight=" + weight
				+ ", noiseControl=" + noiseControl + ", cableFeature=" + cableFeature + ", connectorType="
				+ connectorType + ", battery=" + battery + ", compatibleDevice=" + compatibleDevice + ", microphone="
				+ microphone + ", formfactor=" + formfactor + "]";
	}

}
