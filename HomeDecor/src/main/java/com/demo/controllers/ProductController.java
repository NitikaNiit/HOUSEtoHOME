package com.demo.controllers;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.model.Product;
import com.demo.service.CategoryService;
import com.demo.service.ProductService;


@Controller
public class ProductController {
	@Autowired
private ProductService productService;
	@Autowired
private CategoryService categoryService;
//display form
//http://localhost:8080/project1/admin/product/productform
@RequestMapping("/addProduct")
public String getProductForm(Model model){
	//Product product = new Product();
	model.addAttribute("product", new Product());
	model.addAttribute("categories", categoryService.getCategories());
	return "productform";
}

@ModelAttribute("/product")
public Product newProduct(){
	/*Product newProduct=productService.saveProduct();
	 * /NOT A FINAL VERSION.. */
	return new Product();
	
}



@RequestMapping("/addNewProduct")
public String addProduct(
		@Valid @ModelAttribute(value="product") Product p, BindingResult result)
{if(result.hasErrors())
	return "productform";
productService.saveProduct(p);
return null;	
}

@RequestMapping("/prodlist")
public String getAllProducts(Model model){
	List<Product> products= productService.getAllProducts();
	//Assigning list of products to model attribute products
	model.addAttribute("productList", products);
	return "productlist";	
}

	
	
}
