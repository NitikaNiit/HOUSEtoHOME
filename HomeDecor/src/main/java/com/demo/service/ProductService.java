package com.demo.service;

import java.util.List;
import com.demo.model.Product;

public interface ProductService {

	Product saveProduct(Product product);

	public List<Product> getAllProducts();
	
}
