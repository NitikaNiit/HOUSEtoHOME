package com.demo.service;

import java.util.List;

import com.demo.model.BillingAddress;

public interface BillingService {
public List<BillingAddress> getBillingAddress();
	
	BillingAddress saveBillingAddress(BillingAddress billing);
}
