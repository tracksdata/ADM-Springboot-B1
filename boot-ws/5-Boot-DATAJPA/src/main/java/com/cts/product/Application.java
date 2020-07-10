package com.cts.product;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.ApplicationContext;

import com.cts.product.dao.ProductDao;
import com.cts.product.model.Product;
import com.cts.product.service.ProductCrudOperationsService;

@SpringBootApplication

public class Application {

	public static void main(String[] args) {
		

		
		ApplicationContext ac = SpringApplication.run(Application.class, args);
		ProductCrudOperationsService ps = ac.getBean(ProductCrudOperationsService.class);

		Product p1 = new Product("Book", "Good Book", 10000, LocalDateTime.now());
		Product p2 = new Product("Pen", "Red Ink", 23, LocalDateTime.now());
		Product p3 = new Product("laptop", "Inter Core I7", 1000000, LocalDateTime.now());
		Product p4 = new Product("Mobile", "Apple 11", 200000, LocalDateTime.of(2010, 04, 12, 12, 45, 45));
		Product p5 = new Product("Charger", "Samsung", 3000, LocalDateTime.now());

		// Arrays.asList(p1,p2,p3,p4,p5);

		//ps.saveAll(Arrays.asList(p1, p2, p3, p4, p5));

		
		/*
		  ps.findAll().forEach(product -> {
		 
			System.out.println(product.getId());
			System.out.println(product.getName());
			System.out.println(product.getDescription());
			System.out.println(product.getPrice());
			System.out.println("------------------------------------");
		});
		
		*/
		/*
		ps.findProductByNameLike("%e%").forEach(product -> {
			 
				System.out.println(product.getId());
				System.out.println(product.getName());
				System.out.println(product.getDescription());
				System.out.println(product.getPrice());
				System.out.println("------------------------------------");
			});
			
			*/
		
		/*
		  ps.findProductByPriceGreaterThanEqual(15000).forEach(product->{
				System.out.println(product.getId());
				System.out.println(product.getName());
				System.out.println(product.getDescription());
				System.out.println(product.getPrice());
				System.out.println("------------------------------------");
		  });
		
		*/
		
		/*
		ps.findProductByPriceBetween(2000, 12000).forEach(product->{
			System.out.println(product.getId());
			System.out.println(product.getName());
			System.out.println(product.getDescription());
			System.out.println(product.getPrice());
			System.out.println("------------------------------------");
		});
		
		*/
		
		ps.findByProductName("%a%").forEach(product->{
			System.out.println(product.getId());
			System.out.println(product.getName());
			System.out.println(product.getDescription());
			System.out.println(product.getPrice());
			System.out.println("------------------------------------");
		});
		
		
		
		
		
		
		
		
		
		
		
		 
	}

}
