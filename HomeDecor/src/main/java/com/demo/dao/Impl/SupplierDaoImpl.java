package com.demo.dao.Impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.SupplierDao;
import com.demo.model.Supplier;
@Repository
@Transactional
public class SupplierDaoImpl implements SupplierDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public SupplierDaoImpl(){
		System.out.println("CREATING INSTANCE FOR SUPPLIERDAOIMPL");
	}
	public void saveSupplier(Supplier s) {
		// TODO Auto-generated method stub
		System.out.println(s.getSid());
		Session session=sessionFactory.openSession();
		session.save(s); //insert into session values (.....)
		session.flush();
		session.close();
		System.out.println(s.getSid());
		return;	
	}

	public List<Supplier> getAllSuppliers() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Supplier");
		List<Supplier> suppliers=query.list();
		session.close();
		return suppliers;
		
	}

}



	

