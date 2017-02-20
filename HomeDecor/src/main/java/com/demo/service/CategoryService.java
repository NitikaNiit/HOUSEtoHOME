package com.demo.service;

import java.util.List;

import com.demo.model.Category;

public interface CategoryService {
	public List<Category> getCategories();

	void saveCategory(Category c);


	
}
