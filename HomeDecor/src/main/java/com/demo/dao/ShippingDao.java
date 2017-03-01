package com.demo.dao;

import com.demo.model.ShippingAddress;

public interface ShippingDao {

	/*List<ShippingAddress> getShippingAddress();*/
	ShippingAddress saveOrUpdateShippingAddress(ShippingAddress shipping);
}
