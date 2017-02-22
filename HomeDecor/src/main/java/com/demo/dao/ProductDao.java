package com.demo.dao;

import java.util.List;

import com.demo.model.Product;

public interface ProductDao {
	Product saveProduct(Product product);

	 List<Product> getAllProducts();

}
