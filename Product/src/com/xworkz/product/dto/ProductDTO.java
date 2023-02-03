package com.xworkz.product.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@AllArgsConstructor
@RequiredArgsConstructor
public class ProductDTO implements Serializable {
	
	private Integer id;
	private String name;
	private String companyName;
	private Integer quantity;
	private Integer price;
	private Double quality;

}
