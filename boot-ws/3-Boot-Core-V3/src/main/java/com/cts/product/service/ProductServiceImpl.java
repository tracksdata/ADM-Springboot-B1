package com.cts.product.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.cts.product.dao.ProductCrudOperationsDao;
import com.cts.product.model.Product;

@Service
//@Scope("singleton")
//@PropertySource("myfile.properties")
public class ProductServiceImpl implements ProductCrudOperationsService {

	//@Autowired
	//private Environment env;
	
	@Value("${name}") // Spring EL
	private String empName;

	@Autowired
	@Qualifier(value = "mongoDBDao")
	private ProductCrudOperationsDao crudOps;

	@Override
	public Product save(Product product) {

		System.out.println("ProductServiceImpl ==> save method");
		System.out.println("===> Name is " + empName);
		return crudOps.save(product);
	}

	@Override
	public List<Product> saveAll(Iterator<Product> products) {
		// TODO Auto-generated method stub
		return crudOps.saveAll(products);
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return crudOps.findAll();
	}

	@Override
	public Product findById(int id) {
		// TODO Auto-generated method stub
		return crudOps.findById(id);
	}

	@Override
	public void deleteById(int id) {
		crudOps.deleteById(id);

	}

}
