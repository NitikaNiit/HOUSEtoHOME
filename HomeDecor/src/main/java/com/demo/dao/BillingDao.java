package com.demo.dao;

import java.util.List;

import com.demo.model.BillingAddress;

public interface BillingDao {
	List<BillingAddress> getBillingAddress();
	BillingAddress saveBillingAddress(BillingAddress billing);
}
