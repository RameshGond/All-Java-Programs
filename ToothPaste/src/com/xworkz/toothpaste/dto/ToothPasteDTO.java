package com.xworkz.toothpaste.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import com.xworkz.toothpaste.constants.Color;
import com.xworkz.toothpaste.constants.QuantityInGms;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class ToothPasteDTO implements Serializable {
	
	private Integer id;
	private String brand;
	private LocalDate mfgDate;
	private LocalDate expiryDate;
	private Double price;
	private Color color;
	private QuantityInGms quantityInGms;
	
	public ToothPasteDTO()
	{
		System.out.println("toothpaste dto no args");
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, id, quantityInGms);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ToothPasteDTO other = (ToothPasteDTO) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(id, other.id)
				&& quantityInGms == other.quantityInGms;
	}
	
	

}
