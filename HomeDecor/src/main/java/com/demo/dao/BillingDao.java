package com.demo.dao;

import com.demo.model.BillingAddress;

public interface BillingDao {
	/*List<BillingAddress> getBillingAddress();*/
	BillingAddress saveOrUpdateBillingAddress(BillingAddress billing);
}
