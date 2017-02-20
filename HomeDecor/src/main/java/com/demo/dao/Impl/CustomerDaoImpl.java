package com.demo.dao.Impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.CustomerDao;
import com.demo.model.Customer;
@Repository
@Transactional
public class CustomerDaoImpl implements CustomerDao {
	@Autowired
	private SessionFactory sessionFactory;

	public List<Customer> getCustomers() {
		Session session=sessionFactory.openSession();
		Query query = session.createQuery("from Customer");
		List<Customer> customers =query.list();
		return customers;
	}

	public void saveCustomer(Customer c) {
		System.out.println(c.getId());
		Session session=sessionFactory.openSession();
		session.save(c); //insert into customer values (.....)
		session.flush();
		session.close();
		System.out.println(c.getId());
		return;	
	}

	
}
