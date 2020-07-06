package com.cts.product.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.product.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SessionFactory sf;

	@Override
	public List<Product> findAll() {
		Session ses = sf.getCurrentSession();
		Query<Product> qry = ses.createQuery("from Product");
		List<Product> prods = qry.getResultList();
		return prods;
	}

	@Override
	public void saveProduct(Product prod) {
		System.out.println("DAO: SAVE Product:===> " + System.identityHashCode(prod));
		System.out.println("Save: Transaction:==>  " + sf.getCurrentSession().getTransaction());
		Session ses = sf.getCurrentSession();
		ses.save(prod);

	}

	// find product by id

	@Override
	public Product findById(int id) {
		return sf.getCurrentSession().get(Product.class, id);
	}

	// find Product By Name

	@Override
	public List<Product> findByName(String productName) {

		Session ses = sf.getCurrentSession();
		Query<Product> qry = ses.createQuery("from Product p where p.productName like :pn");
		qry.setParameter("pn", productName);
		return qry.getResultList();

	}

	@Override
	public Object updateProduct(Product newProduct) throws RuntimeException {
		System.out.println("Product ID=======> " + newProduct.getProductId());
		System.out.println("DAO: UPDATE Product:===> " + System.identityHashCode(newProduct));

		System.out.println("Update: Transaction:==>  " + sf.getCurrentSession().getTransaction());

		if (newProduct.getProductId() == 1000) {
			System.out.println("--->>>>>>> In Exception");
			throw new RuntimeException("Product Id can not be updated");
		}

		return sf.getCurrentSession().merge(newProduct);
	}

	@Override
	public void deleteById(int id) {
		sf.getCurrentSession().delete(sf.getCurrentSession().get(Product.class, id));
	}

}
