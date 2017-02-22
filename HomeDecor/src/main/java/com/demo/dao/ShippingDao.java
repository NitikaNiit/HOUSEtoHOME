package com.demo.dao;

import java.util.List;

import com.demo.model.ShippingAddress;

public interface ShippingDao {

	List<ShippingAddress> getShippingAddress();
	ShippingAddress saveShippingAddress(ShippingAddress shipping);
}
