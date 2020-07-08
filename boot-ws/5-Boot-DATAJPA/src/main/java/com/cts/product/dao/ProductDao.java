package com.cts.product.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cts.product.model.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {

	List<Product> findProductByNameLike(String name);
	
	List<Product> findProductByPriceGreaterThanEqual(double price);
	
	List<Product> findProductByPriceBetween(double startPrice,double endPrice);
	
	@Query(value = "from Product p where p.name like :name")
	List<Product> findByProductName(String name);
	
	

}
