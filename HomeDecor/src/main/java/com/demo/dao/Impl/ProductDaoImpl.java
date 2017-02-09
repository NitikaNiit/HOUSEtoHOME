package com.demo.dao.Impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.ProductDao;
import com.demo.model.Product;
@Repository
@Transactional
public class ProductDaoImpl implements ProductDao {
@Autowired
private SessionFactory sessionFactory;
	public ProductDaoImpl(){
		System.out.println("CREATING INSTANCE FOR PRODUCTDAOIMPL");
	}
	
	public void saveProduct(Product p) {
		System.out.println(p.getId());
		Session session=sessionFactory.openSession();
		session.save(p); //insert into product values (.....)
		session.flush();
		session.close();
		System.out.println(p.getId());
		return;	
	}

	public List<Product> getAllProducts() {
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Product");
		List<Product> products=query.list();
		session.close();
		return products;
	}

	public Product getProductById(int id) {
		Session session=sessionFactory.openSession();
		//select * from product where id=
		Product product=(Product)session.get(Product.class, id);
		session.close();
		return product;
	}

	
	

	
	
}