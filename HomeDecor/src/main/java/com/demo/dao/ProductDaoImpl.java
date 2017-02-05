package com.demo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.model.Product;
@Repository
public class ProductDaoImpl implements ProductDao {
@Autowired
private SessionFactory sessionFactory;
	public ProductDaoImpl(){
		System.out.println("CREATING INSTANCE FOR PRODUCTDAOIMPL");
	}
	
	public Product saveProduct(Product product) {
		System.out.println(product.getID());
		Session session=sessionFactory.openSession();
		session.save(product); //insert into product values (.....)
		session.flush();
		session.close();
		System.out.println(product.getID());
		return product;	
	}

}