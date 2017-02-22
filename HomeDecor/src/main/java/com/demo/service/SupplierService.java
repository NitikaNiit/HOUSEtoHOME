package com.demo.service;

import java.util.List;

import com.demo.model.Supplier;

public interface SupplierService {
	Supplier saveSupplier(Supplier supplier);

	public List<Supplier> getAllSuppliers();
}
