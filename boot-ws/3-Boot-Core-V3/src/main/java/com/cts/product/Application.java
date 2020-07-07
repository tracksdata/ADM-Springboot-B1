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

		ProductCrudOperationsService crudService1 = ac.getBean(ProductCrudOperationsService.class);
		ProductCrudOperationsService crudService2 = ac.getBean(ProductCrudOperationsService.class);

		System.out.println("Hashcode of crudService1 is " + System.identityHashCode(crudService1));
		System.out.println("Hashcode of crudService2 is " + System.identityHashCode(crudService2));

		Product product = new Product();
		product.setId(10);
		product.setName("Book");
		product.setDescription("Spring boot");
		product.setPrice(2500);

		crudService1.save(product);

	}

}
