package com.xworkz.product.order;

import java.io.Serializable;
import java.util.Comparator;

import com.xworkz.product.dto.ProductDTO;

public class ProductIdAsc implements Comparator<ProductDTO> {

	@Override
	public int compare(ProductDTO o1, ProductDTO o2) {
		Integer id1 = o1.getId();
		Integer id2 = o2.getId();
		return id1.compareTo(id2);
	}

}
