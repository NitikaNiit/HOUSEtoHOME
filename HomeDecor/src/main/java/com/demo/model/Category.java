package com.demo.model;

import java.util.List;

import javax.persistence.*;


@Entity
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String categoryDetails;
	@OneToMany(mappedBy="category" , cascade= CascadeType.ALL, fetch=FetchType.EAGER)
	private List<Product> products;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategoryDetails() {
		return categoryDetails;
	}
	public void setCategoryDetails(String categoryDetails) {
		this.categoryDetails = categoryDetails;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	@Override
	public String toString() {
	  		return this.id + " " + this.categoryDetails;
	 		
	  	}
}
