package com.cts.product.dao;

import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cts.product.model.Product;

@Repository(value = "mySqlDao")
public class ProductDaoImpl implements ProductCrudOperationsDao {

	@Override
	public Product save(Product product) {
		// code to persist to DB
		System.out.println("DAO: ProductDaoImpl ==> save method for mysql");
		return product;
	}

	@Override
	public List<Product> saveAll(Iterator<Product> products) {
		return null;
	}

	@Override
	public List<Product> findAll() {
		return null;
	}

	@Override
	public Product findById(int id) {
		return null;
	}

	@Override
	public void deleteById(int id) {

	}

}
