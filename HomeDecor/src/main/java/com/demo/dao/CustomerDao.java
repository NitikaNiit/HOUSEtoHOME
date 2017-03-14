package com.demo.dao;

import com.demo.model.Customer;

public interface CustomerDao {
	/*List<Customer> getCustomers();*/

	Customer saveOrUpdateCustomer(Customer customer);
	Customer getCustomerByUsername(String username);
}
