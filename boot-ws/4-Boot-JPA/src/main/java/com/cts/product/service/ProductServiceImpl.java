package com.cts.product.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Service;

import com.cts.product.dao.ProductCrudOperationsDao;
import com.cts.product.model.Product;

@Service
public class ProductServiceImpl implements ProductCrudOperationsService {

	@Autowired
	@Qualifier(value = "mySqlDao")
	private ProductCrudOperationsDao crudOps;

	@Override
	@Transactional
	public Product save(Product product) {
		return crudOps.save(product);
	}

	@Override
	@Transactional
	public List<Product> saveAll(List<Product> products) {
		// TODO Auto-generated method stub
		return crudOps.saveAll(products);
	}

	@Override
	@Transactional
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return crudOps.findAll();
	}

	@Override
	@Transactional
	public Product findById(int id) {
		// TODO Auto-generated method stub
		return crudOps.findById(id);
	}

	@Override
	@Transactional
	public void deleteById(int id) {
		crudOps.deleteById(id);

	}

}
