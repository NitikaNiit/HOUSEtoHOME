package com.demo.controllers;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.demo.model.Category;
import com.demo.model.Product;
import com.demo.model.Supplier;
import com.demo.service.CategoryService;
import com.demo.service.ProductService;
import com.demo.service.SupplierService;

@Controller
/*@RequestMapping("/admin")*/
public class ProductController {
	@Autowired
	private ProductService productService;
	@Autowired
	private CategoryService categoryService;
	@Autowired
	private SupplierService supplierService;
	// display form
	// http://localhost:8080/project1/admin/product/productform
	@RequestMapping("/addProduct")
	public String getProductForm(Model model) {
		// Product product = new Product();
		model.addAttribute("product", new Product());
		model.addAttribute("categories", categoryService.getCategories());
		model.addAttribute("suppliers", supplierService.getAllSuppliers());
		return "productform";
	}

	@ModelAttribute("productcommand")
	public Product newProduct() {
		/*
		 * Product newProduct=productService.saveProduct(); /NOT A FINAL
		 * VERSION..
		 */
		return new Product();

	}

	@RequestMapping("/addNewProduct")
	public String addProduct(@Valid @ModelAttribute("productcommand") Product product, BindingResult result, HttpServletRequest request) {
		if (result.hasErrors())
			return "productform";
		productService.saveOrUpdateProduct(product);
		MultipartFile prodImage=product.getImage();
		if(!prodImage.isEmpty()){
			Path paths=
	Paths.get("C:/Users/Admin/git/HOUSEtoHOME/HomeDecor/src/main/webapp/WEB-INF/resources/Images/"+ product.getId()+".jpg");
		try {
			prodImage.transferTo(new File(paths.toString()));
		}
		catch (IllegalStateException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		}
		return "redirect:/prodlist";
			
		
}

	@RequestMapping("/prodlist")
	public String getAllProducts(Model model) {
		List<Product> products = productService.getAllProducts();
		// Assigning list of products to model attribute products
		model.addAttribute("productList", products);
		return "productlist";
	}
	
	@RequestMapping("/viewproduct/{id}")
	public String viewProduct(@PathVariable int id,Model model){
		Product product=productService.getProductById(id);
		model.addAttribute("product",product);
	return "viewproduct";
	}
	
	@RequestMapping("/deleteproduct/{id}")
	public String deleteProduct(@PathVariable int id){
		productService.deleteProduct(id);
		return "redirect:/editform/{id}";
	}


	/**
	 *    to display the form to edit product details
	 */
	@RequestMapping("/editform/{id}")
	public String editProductForm(@PathVariable int id,Model model){
		model.addAttribute("product",productService.getProductById(id));
		model.addAttribute("categories",categoryService.getCategories());
		model.addAttribute("suppliers", supplierService.getAllSuppliers());
		return "editproductform";
	}
	
	@RequestMapping("/editProduct")
	public String editProductDetails(@Valid @ModelAttribute("product") Product product, BindingResult result, HttpServletRequest request) {
		if (result.hasErrors())
			return "editproductform";
		MultipartFile prodImage=product.getImage();
		if(!prodImage.isEmpty()){
			Path paths=
	Paths.get("C:/Users/Admin/git/HOUSEtoHOME/HomeDecor/src/main/webapp/WEB-INF/resources/Images/"+ product.getId()+".jpg");
		try {
			prodImage.transferTo(new File(paths.toString()));
		}
		catch (IllegalStateException e) {
			e.printStackTrace();
		} 
		catch (IOException e){ 
			e.printStackTrace();
		}
		}
		productService.saveOrUpdateProduct(product);
		return "redirect:/prodlist";
	}


}
