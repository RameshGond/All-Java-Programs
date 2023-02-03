package com.xworkz.organs.dto;

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
public class OrgansDTO implements Serializable, Comparable<OrgansDTO> {

	private String name;
	private String function;
	private Double weight;
	private Double price;

	@Override
	public int compareTo(OrgansDTO o) {
		if (o != null && o.getName() != null) {
			System.out.println("comparing objects");
		}
		return this.name.compareTo(o.getName());
	}

	@Override
	public int hashCode() {
		System.out.println("running hashcode");
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			System.out.println("object not equals to null,can compare");
			OrgansDTO dog = (OrgansDTO) obj;
			if (this.name.equals(dog.name)) {
				System.out.println("object is equals");
			}
			return true;
		}
		return super.equals(obj);
	}

}
