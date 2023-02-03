package com.xworkz.newspaper.dto;

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
public class NewsPaperDTO implements Serializable, Comparable<NewsPaperDTO> {
	private String name;
	private Integer noOfPages;
	private String language;
	private Double price;
	private Integer quantity;

	@Override
	public int compareTo(NewsPaperDTO o) {
		if (o != null && o.getName() != null) {
			System.out.println("comparing objects");
		}
		return this.name.compareTo(o.getName());
	}

	@Override
	public int hashCode() {
		System.out.println("running hash code");
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			System.out.println("object is not null,can be compare");
			NewsPaperDTO satya = (NewsPaperDTO) obj;
			if (this.name.equals(satya.name)) {
				System.out.println("object is equals");
			}
			return true;
		}
		return super.equals(obj);
	}

}
