package com.demo.service;

import java.util.List;

import com.demo.model.ShippingAddress;

public interface ShippingService {
public List<ShippingAddress> getShippingAddress();
	
	ShippingAddress saveShippingAddress(ShippingAddress shipping);
}
