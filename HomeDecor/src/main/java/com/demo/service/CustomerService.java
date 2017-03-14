package com.demo.service;

import com.demo.model.Customer;

public interface CustomerService {
	/*public List<Customer> getCustomers();*/

	Customer saveOrUpdateCustomer(Customer customer);
	public Customer getCustomerByUsername(String username);

}
