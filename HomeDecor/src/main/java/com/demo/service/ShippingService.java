package com.demo.service;

import com.demo.model.ShippingAddress;

public interface ShippingService {
/*public List<ShippingAddress> getShippingAddress();*/
	
	ShippingAddress saveOrUpdateShippingAddress(ShippingAddress shipping);
}
