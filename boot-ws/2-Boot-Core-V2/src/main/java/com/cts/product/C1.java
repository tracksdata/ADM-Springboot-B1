package com.cts.product;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class C1 {
	@Bean
	public void f1() {
		System.out.println("===> C1 class f1 method");
	}

}
