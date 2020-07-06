package com.cts.product.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao prodDao;

	@Override
	@Transactional
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return prodDao.findAll();
	}

	@Override
	@Transactional // Required
	public void saveProduct(Product prod) throws RuntimeException {
		// step -1 - save Product
		prodDao.saveProduct(prod); // step -1
		prodDao.updateProduct(new Product());

	}

	@Override
	@Transactional
	public Product findById(int id) {
		// TODO Auto-generated method stub
		return prodDao.findById(id);
	}

	@Override
	@Transactional
	public List<Product> findByName(String productName) {
		// TODO Auto-generated method stub
		return prodDao.findByName(productName);
	}

	@Override
	@Transactional // Required
	public Object updateProduct(Product newProduct) throws RuntimeException {

		// TODO Auto-generated method stub
		// Product prod=findById(newProduct.getProductId());
		// if(prod==null) {
		// return null;
		// }

		return prodDao.updateProduct(newProduct);
	}

	@Override
	@Transactional
	public void deleteById(int id) {
		prodDao.deleteById(id);
	}

}
