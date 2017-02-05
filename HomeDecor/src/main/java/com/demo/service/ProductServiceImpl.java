package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.ProductDao;
import com.demo.model.Product;

@Service
class ProductServiceImpl implements ProductService{
@Autowired
private ProductDao productDao;
public Product saveProduct(Product product){
	return product;
//call the Dao method using productDao variable
}


}

