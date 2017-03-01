package com.demo.service;

import com.demo.model.BillingAddress;

public interface BillingService {
/*public List<BillingAddress> getBillingAddress();
	*/
	BillingAddress saveOrUpdateBillingAddress(BillingAddress billing);
}
