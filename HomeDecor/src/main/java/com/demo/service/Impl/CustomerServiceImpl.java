package com.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.CustomerDao;
import com.demo.model.Customer;
import com.demo.service.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao customerDao;

	/*public List<Customer> getCustomers() {
		return customerDao.getCustomers();
	}*/

	public Customer saveOrUpdateCustomer(Customer customer) {
		return customerDao.saveOrUpdateCustomer(customer);
	}

	public Customer getCustomerByUsername(String username){
		return customerDao.getCustomerByUsername(username);
	}
	
	
}
