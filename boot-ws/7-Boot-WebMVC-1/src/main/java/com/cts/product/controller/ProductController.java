package com.cts.product.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.product.model.Product;
import com.cts.product.service.ProductCrudOperationsService;

@Controller
public class ProductController {

	@Autowired
	private ProductCrudOperationsService ps;

	@RequestMapping(value = "/")
	public String welcome() {
		return "index";
	}

	// load form

	@RequestMapping("/loadForm")
	public String loadForm(Model prodData) {

		Product prod = new Product();
		prod.setName("Name1");
		prod.setDescription("Good");
		prod.setDateAdded(LocalDateTime.now());
		prod.setPrice(76);

		prodData.addAttribute("product", prod);

		return "productform";
	}

	@RequestMapping("saveProduct")
	public String saveProduct(@RequestParam("name") String name, @RequestParam("price") double price,
			@RequestParam("description") String description, @RequestParam("dateAdded") String dateAdded) {

		System.out.println(name);
		System.out.println(dateAdded);
		return "index";
	}

	@RequestMapping("/findAll")
	public ModelAndView findAll() {

		ModelAndView mav = new ModelAndView();

		List<Product> products = ps.findAll();
		String viewName;

		if (products.size() == 0) {
			viewName = "errorPage";
		} else {
			viewName = "products";
		}

		mav.addObject("prods", products);

		mav.setViewName(viewName);

		return mav;

	}

	@RequestMapping("saveProductV1")
	public String saveProductV1(@ModelAttribute Product prod,
			@RequestParam("productDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime dateAdded) {

		prod.setDateAdded(dateAdded);
		System.out.println(prod.getName());
		System.out.println(prod.getPrice());
		System.out.println(prod.getDescription());
		// System.out.println(dateAdded);
		System.out.println(prod.getDateAdded());

		ps.save(prod);

		return "index";
	}

}
