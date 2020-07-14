package com.cts.product;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.dao.ProductDao;
import com.cts.product.dao.ReviewsDao;
import com.cts.product.dao.UserDao;
import com.cts.product.entity.Product;
import com.cts.product.entity.Reviews;
import com.cts.product.entity.User;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		Product p1 = new Product("Pen", 10, "Red Ink");
		Product p2 = new Product("Book", 200, "Java Book");
		Product p3 = new Product("Laptop", 75000, "Dell Laptop");

		User u1 = new User("praveen", "password123", "Praveen", "male", 1212345676);
		User u2 = new User("james", "password123", "James", "male", 1212345676);
		User u3 = new User("richards", "password123", "Richards", "male", 1212345676);

		Reviews r1 = new Reviews("Good", LocalDateTime.now(), u1);
		Reviews r2 = new Reviews("Good", LocalDateTime.now(), u2);
		Reviews r3 = new Reviews("Good", LocalDateTime.now(), u3);
		Reviews r4 = new Reviews("Good", LocalDateTime.now(), u1);
		Reviews r5 = new Reviews("Good", LocalDateTime.now(), u2);
		Reviews r6 = new Reviews("Good", LocalDateTime.now(), u3);
		Reviews r7 = new Reviews("Good", LocalDateTime.now(), u1);

		p1.getReviews().add(r1);
		// p1.getReviews().add(r1);
		p1.getReviews().add(r2);
		p1.getReviews().add(r3);
		p1.getReviews().add(r4);

		p2.getReviews().add(r5);
		p2.getReviews().add(r6);

		// p3.getReviews().add(r1);
		// p3.getReviews().add(r2);
		// p3.getReviews().add(r3);
		// p3.getReviews().add(r4);
		// p3.getReviews().add(r5);
		// p3.getReviews().add(r6);
		p3.getReviews().add(r7);

		ApplicationContext ac = SpringApplication.run(Application.class, args);
		ProductDao prodDao = ac.getBean(ProductDao.class);
		ReviewsDao reviewsDao = ac.getBean(ReviewsDao.class);
		UserDao userDao = ac.getBean(UserDao.class);

		//prodDao.saveAll(Arrays.asList(p1, p2, p3));
		// userDao.saveAll(Arrays.asList(u1,u2,u3));
		//reviewsDao.saveAll(Arrays.asList(r1, r2, r3, r4, r5, r6, r7));
		
		Product prod= prodDao.findById(1).orElse(null);
		
		System.out.println("Id: "+prod.getId());
		System.out.println("Name: "+prod.getName());
		System.out.println("price: "+prod.getPrice());
		System.out.println("Description: "+prod.getDescription());
		System.out.println("-----------------------------------------");
		
		for(Reviews r:prod.getReviews()) {
			System.out.println("review Id: "+r.getReviewId());
			System.out.println("Review: "+r.getReview());
			System.out.println("On Date: "+r.getReviewDate());
			System.out.println("User: "+r.getUser().getUserName());
			System.out.println("-------------------------------------");
		}
		
		
		
		

	}

}
