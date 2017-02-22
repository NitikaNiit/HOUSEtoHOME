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

	public Customer saveCustomer(Customer customer) {
		System.out.println(customer.getId());
		Session session=sessionFactory.openSession();
		session.save(customer); //insert into customer values (.....)
		session.flush();
		session.close();
		System.out.println(customer.getId());
		return customer;	
	}

	
}
