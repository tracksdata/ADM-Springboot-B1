package com.cts.product.service;

import java.util.Iterator;
import java.util.List;

import com.cts.product.model.Product;

public interface ProductCrudOperationsService {

	Product save(Product product);

	List<Product> saveAll(Iterator<Product> products);

	List<Product> findAll();

	Product findById(int id);

	void deleteById(int id);

}
