package com.xworkz.waterpark.dto;

import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class WaterParkDTO implements Comparable<WaterParkDTO> {
	private String name;
	private String location;
	private Double ticketPrice;
	private LocalTime openingTime;
	private String state;

	@Override
	public int compareTo(WaterParkDTO o) {
		if (o != null && o.getName() != null) {

		}
		return this.name.compareTo(o.getName());

	}

}
