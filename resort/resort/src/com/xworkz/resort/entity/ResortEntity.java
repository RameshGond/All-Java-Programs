package com.xworkz.resort.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="resort")
public class ResortEntity {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="location")
	private String location;
	@Column(name="checkInTime")
	private LocalTime checkInTime;
	@Column(name="checkOutTime")
	private LocalTime checkOutTime;
	@Column(name="createdBy")
	private String createdBy;
	@Column(name="createdDate")
	private LocalDate createdDate;
	@Column(name="updatedBy")
	private String updatedBy;
	@Column(name="updatedDate")
	private LocalDate updatedDate;
	@Column(name="owner")
	private String owner;
	@Column(name="pricePerDay")
	private double pricePerDay;

}
