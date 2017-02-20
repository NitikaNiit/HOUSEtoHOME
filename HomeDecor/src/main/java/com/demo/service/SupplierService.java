package com.demo.service;

import java.util.List;

import com.demo.model.Supplier;

public interface SupplierService {
	void saveSupplier(Supplier p);

	public List<Supplier> getAllSuppliers();
}
