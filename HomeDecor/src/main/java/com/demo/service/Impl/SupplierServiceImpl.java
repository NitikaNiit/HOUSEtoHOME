package com.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.SupplierDao;
import com.demo.model.Supplier;
import com.demo.service.SupplierService;


@Service
public class SupplierServiceImpl implements SupplierService{
@Autowired
private SupplierDao supplierDao;
public SupplierServiceImpl(){
	System.out.println("CREATING INSTANCE FOR SUPPLIERSERVICEIMPL");
		
}

public void saveSupplier(Supplier s){
	supplierDao.saveSupplier(s);
//call the Dao method using productDao variable
}

public List<Supplier> getAllSuppliers() {
	return supplierDao.getAllSuppliers();
	 
	
	
}





}




