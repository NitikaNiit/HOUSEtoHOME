package com.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.ShippingDao;
import com.demo.model.ShippingAddress;
import com.demo.service.ShippingService;

@Service
public class ShippingServiceImpl implements ShippingService {
	@Autowired
private ShippingDao shippingDao;
	
	public List<ShippingAddress> getShippingAddress() {
		// TODO Auto-generated method stub
		return shippingDao.getShippingAddress();
	}

	public ShippingAddress saveShippingAddress(ShippingAddress shipping) {
		// TODO Auto-generated method stub
		return shippingDao.saveShippingAddress(shipping);
	}

	

}