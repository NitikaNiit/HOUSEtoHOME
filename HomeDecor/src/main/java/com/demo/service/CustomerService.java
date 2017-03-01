package com.demo.service;

import com.demo.model.Customer;

public interface CustomerService {
	/*public List<Customer> getCustomers();*/

	Customer saveOrUpdateCustomer(Customer customer);
	/*ShippingAddress saveShippingAddress(ShippingAddress shipping);
	BillingAddress saveBillingAddress(BillingAddress billing);*/
}
