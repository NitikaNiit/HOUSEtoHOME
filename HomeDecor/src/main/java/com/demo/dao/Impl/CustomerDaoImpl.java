package com.demo.dao.Impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.CustomerDao;
import com.demo.model.Authorities;
import com.demo.model.BillingAddress;
import com.demo.model.Customer;
import com.demo.model.ShippingAddress;
import com.demo.model.Users;
@Repository
@Transactional
public class CustomerDaoImpl implements CustomerDao  {
	@Autowired
	private SessionFactory sessionFactory;

	
	public Customer saveOrUpdateCustomer(Customer customer) {
		Session session=sessionFactory.openSession();
		//child tables - Users, billingAddress, ShippingAddress
		BillingAddress billingAddress = customer.getBillingAddress();
		ShippingAddress shippingAddress = customer.getShippingAddress();
		customer.setBillingAddress(billingAddress);
		customer.setShippingAddress(shippingAddress);
		session.saveOrUpdate(billingAddress);
		session.saveOrUpdate(shippingAddress);
		
		
		Users users = new Users();
		users.setUsersId(customer.getId());
		users.setUsername(customer.getUsername());
		users.setPassword(customer.getPassword());
		users.setEnabled(true);
		Authorities authority = new Authorities();
		authority.setRole("ROLE_USER");
		authority.setUsername(customer.getUsername());
		
		session.saveOrUpdate(users);
		session.saveOrUpdate(authority);
		session.saveOrUpdate(customer); //insert into customer values (.....)
		session.flush();
		session.close();
		System.out.println(customer.getId());
		return customer;	
	}


	

	

	

	

	
}
