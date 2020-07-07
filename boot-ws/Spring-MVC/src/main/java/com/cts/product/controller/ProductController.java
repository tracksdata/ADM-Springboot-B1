package com.cts.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

@Controller
public class ProductController {

	
	
	@Autowired
	private ProductService ps;

	@RequestMapping("/")
	public String welocme() {
		return "index";
	}

	// load Product Form Page

	@RequestMapping("/loadProductForm")
	public String loadProductForm() {
		return "productform";
	}

	// save Product Data to DB

	@RequestMapping("/saveProduct")
	public String saveProduct(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam("price") double price, @RequestParam("description") String description) {
		Product prod = new Product();
		prod.setId(id);
		prod.setName(name);
		prod.setPrice(price);
		prod.setDescription(description);

		ps.saveProduct(prod);

		return "productform";
	}

	// load product into form for uodate

	@RequestMapping("/update")
	public String update(@ModelAttribute Product prod) {

		System.out.println("====> ID: "+prod.getId());
		
		return null;
	}

	@RequestMapping("/saveProductV2")
	public String saveproductV2(@ModelAttribute Product prod, Model data) {

		ps.saveProduct(prod);

		data.addAttribute("msg", "Product Saved Successfully");

		return "redirect:/listAll";
	}

	// List all produst to jsp

	@RequestMapping("/listAll")
	public String listAll(Model data) {

		List<Product> prods = ps.findAll();
		System.out.println(prods);

		data.addAttribute("prods", prods);

		return "products";
	}


}
