package com.xworkz.springfw.annotation.beans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class IronBoxBean {
	private String brand;
	private int price;
	private int warrenty;
	private String materialType;
	private String color;
	private double temperature;
	private double weight;
	private LocalDate manufacturedDate;
	private int isi;
	private boolean waterProof;
	private int ratedVoltage;
	private String marketedBy;
	private String manufaturedAt;
	private int rating;

	public IronBoxBean(@Value("usha") String brand, @Value("2000") int price, @Value("5") int warrenty,
			@Value("Waterproof") String materialType, @Value("white") String color, @Value("2D") double temperature,
			@Value("3.0") double weight, @Value("2345") int isi, @Value("3") int ratedVoltage,
			@Value("china") String marketedBy, @Value("Delhi") String manufaturedAt, @Value("5") int rating) {
		super();
		this.brand = brand;
		this.price = price;
		this.warrenty = warrenty;
		this.materialType = materialType;
		this.color = color;
		this.temperature = temperature;
		this.weight = weight;
		// this.manufacturedDate = manufacturedDate;
		this.isi = isi;
		// this.waterProof = waterProof;
		this.ratedVoltage = ratedVoltage;
		this.marketedBy = marketedBy;
		this.manufaturedAt = manufaturedAt;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "IronBoxBean [brand=" + brand + ", price=" + price + ", warrenty=" + warrenty + ", materialType="
				+ materialType + ", color=" + color + ", temperature=" + temperature + ", weight=" + weight + ", isi="
				+ isi + ", ratedVoltage=" + ratedVoltage + ", marketedBy=" + marketedBy + ", manufaturedAt="
				+ manufaturedAt + ", rating=" + rating + "]";
	}

}
