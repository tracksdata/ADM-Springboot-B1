package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.model.Product;
import com.cts.product.service.ProductCrudOperationsService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext ac = SpringApplication.run(Application.class, args);

		ProductCrudOperationsService ps = ac.getBean(ProductCrudOperationsService.class);

		Product product = ps.findById(2);

		product.setName("Spring Level-3");
		 //product.setDescription("Spring boot");
		//product.setPrice(5000);

		ps.save(product);

		/*
		 * ps.findAll().forEach(prod->{ System.out.println(prod.getId());
		 * System.out.println(prod.getName()); System.out.println(prod.getPrice());
		 * System.out.println(prod.getDescription());
		 * System.out.println("-----------------------------"); });
		 * 
		 */

	}

}
