package com.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.ProductDao;
import com.demo.model.Product;
import com.demo.service.ProductService;


@Service
public class ProductServiceImpl implements ProductService{
@Autowired
private ProductDao productDao;
public ProductServiceImpl(){
	System.out.println("CREATING INSTANCE FOR PRODUCTSERVICEIMPL");
		
}

public Product saveProduct(Product product){
	return productDao.saveProduct(product);
//call the Dao method using productDao variable
}

public List<Product> getAllProducts() {
	return productDao.getAllProducts();
	 
	
	
}









}
