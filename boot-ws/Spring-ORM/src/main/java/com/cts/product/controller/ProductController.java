package com.cts.product.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.cts.product.config.AppConfig;
import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

public class ProductController {

	public static void main(String[] args) {

		AbstractApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		ProductService ps = ac.getBean(ProductService.class);

		Product prod = new Product();
		prod.setProductId(2003);
		prod.setProductName("Blue Pen");
		prod.setPrice(45.45);

		ps.saveProduct(prod); // New Transaction
		
		

	}

}
