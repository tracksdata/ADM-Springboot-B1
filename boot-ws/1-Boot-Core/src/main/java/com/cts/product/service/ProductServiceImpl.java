package com.cts.product.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl {

	@Bean
	public void f2() {
		System.out.println("---- hello >>> f2");
	}

	public void f1() {
		System.out.println("hello f1");
	}

}
