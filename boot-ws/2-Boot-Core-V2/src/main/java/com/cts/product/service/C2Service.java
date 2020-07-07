package com.cts.product.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class C2Service {

	@Bean
	public void f2() {
		System.out.println("===> C2Service f2 method  <=====");
	}

}
