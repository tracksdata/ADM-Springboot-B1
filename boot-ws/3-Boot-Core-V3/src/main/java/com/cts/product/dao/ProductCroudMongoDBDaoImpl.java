package com.cts.product.dao;

import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cts.product.model.Product;
@Repository(value = "mongoDBDao")
public class ProductCroudMongoDBDaoImpl implements ProductCrudOperationsDao {

	@Override
	public Product save(Product product) {
		System.out.println("DAO: ProductCroudMongoDBDaoImpl save method");
		return null;
	}

	@Override
	public List<Product> saveAll(Iterator<Product> products) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub

	}

}
