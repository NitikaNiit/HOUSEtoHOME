package com.demo.dao;

import java.util.List;

import com.demo.model.Supplier;

public interface SupplierDao {

	Supplier saveSupplier(Supplier s);

	List<Supplier> getAllSuppliers();


}
