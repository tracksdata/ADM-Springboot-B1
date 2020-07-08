package com.cts.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.dao.ProductDao;
import com.cts.product.model.Product;

@Service
public class ProductServiceImpl implements ProductCrudOperationsService {

	@Autowired
	private ProductDao prodDao;

	@Override
	public Product save(Product product) {
		// TODO Auto-generated method stub
		return prodDao.save(product);
	}

	@Override
	public List<Product> saveAll(List<Product> products) {
		// TODO Auto-generated method stub
		return prodDao.saveAll(products);
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return prodDao.findAll();
	}

	@Override
	public Product findById(int id) {
		return prodDao.findById(id).orElse(null);
	}

	@Override
	public void deleteById(int id) {
		prodDao.deleteById(id);

	}

	@Override
	public List<Product> findProductByNameLike(String name) {
		// TODO Auto-generated method stub
		return prodDao.findProductByNameLike(name);
	}

	@Override
	public List<Product> findProductByPriceGreaterThanEqual(double price) {
		// TODO Auto-generated method stub
		return prodDao.findProductByPriceGreaterThanEqual(price);
	}

	@Override
	public List<Product> findProductByPriceBetween(double startPrice, double endPrice) {
		// TODO Auto-generated method stub
		return prodDao.findProductByPriceBetween(startPrice, endPrice);
	}

	@Override
	public List<Product> findByProductName(String name) {
		// TODO Auto-generated method stub
		return prodDao.findByProductName(name);
	}

}
