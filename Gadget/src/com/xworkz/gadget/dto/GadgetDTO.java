package com.xworkz.gadget.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GadgetDTO {
	private Integer id;
	private String name;
	private String type;
	private Double price;
	private String manufacturer;
	private LocalDate manufactureDate;
	private Integer warrantyPeriod;
	private Integer rating;
	private Boolean isi;
	private Integer serialNo;
	private String createdBy;
	private LocalDate createdDate;
	private String updatedBy;
	private LocalDate updatedDate;

}
