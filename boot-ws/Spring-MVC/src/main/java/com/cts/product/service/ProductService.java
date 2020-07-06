package com.cts.product.service;

import java.util.List;

import javax.transaction.Transactional;

import com.cts.product.entity.Product;

public interface ProductService {

	List<Product> findAll();

	void saveProduct(Product prod) throws RuntimeException;

	Product findById(int id);

	List<Product> findByName(String productName);

	Object updateProduct(Product newProduct) throws RuntimeException;

	void deleteById(int id);

}