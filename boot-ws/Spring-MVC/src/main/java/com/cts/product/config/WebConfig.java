package com.cts.product.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan("com.cts.product.controller")
public class WebConfig implements WebMvcConfigurer {

	// View Resolver
	@Bean
	public InternalResourceViewResolver resolver() {
		System.out.println("--- WebConfig class InternalResourceViewResolver initialized...");
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setViewClass(JstlView.class);
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

	// Resource Handler
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}

	@Bean
	public MessageSource messageSource() {
		System.out.println("--- WebConfig class ResourceBundleMessageSource initialized....");

		ResourceBundleMessageSource source = new ResourceBundleMessageSource();
		source.setBasename("application");
		return source;
	}

}
