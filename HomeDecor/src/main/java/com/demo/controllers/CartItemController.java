package com.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.demo.model.Cart;
import com.demo.model.CartItem;
import com.demo.model.Customer;
import com.demo.model.Product;
import com.demo.service.CartItemService;
import com.demo.service.CustomerService;
import com.demo.service.ProductService;

@Controller
public class CartItemController {
	@Autowired
	private CartItemService cartItemService;
	@Autowired
	private CustomerService customerService;
	@Autowired
	private ProductService productService;

	@RequestMapping(value = "/addCartItem/{id}", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void addCartItem(@PathVariable(value = "id") int productId) {
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		Customer customer = customerService.getCustomerByUsername(user.getUsername());// from
																						// Users
																						// where
																						// username=?
		Cart cart = customer.getCart();
		Product product = productService.getProductById(productId);
		List<CartItem> cartItems = cart.getCartItems();

		for (int i = 0; i < cartItems.size(); i++) {
			CartItem cartItem = cartItems.get(i);
			Product p = cartItem.getProduct();
			// 1 == 1
			if (p.getId() == productId) {
				cartItem.setQuantity(cartItem.getQuantity() + 1);// increment
																	// the
																	// quantity
				cartItem.setTotalPrice(cartItem.getQuantity() * p.getPrice()); // update
																				// the
																				// total
																				// price
				cartItemService.addCartItem(cartItem);// update the quantity in
														// the cartitem
				return;
			}
		}

		CartItem cartItem = new CartItem();
		cartItem.setQuantity(1);
		cartItem.setTotalPrice(cartItem.getQuantity() * product.getPrice());
		cartItem.setProduct(product); // set product id
		cartItem.setCart(cart);// set cart id
		cartItemService.addCartItem(cartItem); // insert query
	}
}