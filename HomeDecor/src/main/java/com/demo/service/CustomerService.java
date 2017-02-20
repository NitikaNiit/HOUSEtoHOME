package com.demo.service;

import java.util.List;

import com.demo.model.Customer;

public interface CustomerService {
	public List<Customer> getCustomers();

	void saveCustomer(Customer c);

}
