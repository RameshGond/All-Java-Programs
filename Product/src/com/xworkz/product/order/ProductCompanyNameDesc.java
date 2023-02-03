package com.xworkz.product.order;

import java.util.Comparator;

import com.xworkz.product.dto.ProductDTO;

public class ProductCompanyNameDesc implements Comparator<ProductDTO> {

	@Override
	public int compare(ProductDTO o1, ProductDTO o2) {
		String companyName1 = o1.getCompanyName();
		String companyName2 = o2.getCompanyName();
		return companyName2.compareTo(companyName1);
	}

}
