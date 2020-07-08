package com.cts.product.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cts.product.model.Product;

@Repository(value = "mySqlDao")
public class ProductDaoImpl implements ProductCrudOperationsDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Product save(Product product) {

		if (findById(product.getId()) != null) {
			em.merge(product);
		} else
			em.persist(product);
		return product;
	}

	@Override
	public List<Product> saveAll(List<Product> products) {

		for (Product product : products) {
			em.persist(product);
		}
		return products;
	}

	@Override
	public List<Product> findAll() {
		String qry = "from Product";
		return em.createQuery(qry).getResultList();
	}

	@Override
	public Product findById(int id) {
		return em.find(Product.class, id);
	}

	@Override
	public void deleteById(int id) {
		em.remove(em.find(Product.class, id));
	}

}
