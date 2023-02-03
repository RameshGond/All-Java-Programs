package com.xworkz.mapinterface.dto;

import java.io.Serializable;

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
public class AddressDTO implements Serializable, Comparable<AddressDTO> {
	private Integer id;
	private String street;
	private Integer doorNo;
	private String city;

	@Override
	public int compareTo(AddressDTO o) {
		if (o != null && o.id != null) {
			return o.getId().compareTo(this.id);
		}
		throw new IllegalArgumentException("id can not be null");
	}

}
