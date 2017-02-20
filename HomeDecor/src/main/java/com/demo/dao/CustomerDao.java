package com.demo.dao;

import java.util.List;

import com.demo.model.Customer;

public interface CustomerDao {
	List<Customer> getCustomers();

	void saveCustomer(Customer c);

}
