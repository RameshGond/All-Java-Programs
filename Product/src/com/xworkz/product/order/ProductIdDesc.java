package com.xworkz.product.order;

import java.util.Comparator;

import com.xworkz.product.dto.ProductDTO;

public class ProductIdDesc implements Comparator<ProductDTO> {

	@Override
	public int compare(ProductDTO o1, ProductDTO o2) {
		Integer id1 = o1.getId();
		Integer id2 = o2.getId();
		return id2.compareTo(id1);
	}
	
	
	

}
