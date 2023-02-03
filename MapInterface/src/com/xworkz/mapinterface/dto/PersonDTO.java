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
public class PersonDTO implements Serializable, Comparable<PersonDTO> {
	private Integer id;
	private String name;
	private String email;
	private Long mobile;

	@Override
	public int compareTo(PersonDTO o) {
		if (o != null && o.getName() != null) {
			return o.getName().compareTo(this.name);
		}
		throw new IllegalArgumentException("name can not be null");
	}

}
