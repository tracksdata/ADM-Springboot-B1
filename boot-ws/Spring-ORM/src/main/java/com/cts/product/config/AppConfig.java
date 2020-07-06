package com.cts.product.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.cts.product.entity.Product;

@Configuration
@ComponentScan("com.cts.product.service,com.cts.product.dao")
@EnableTransactionManagement
@PropertySource("db.properties")
public class AppConfig {
	
	@Autowired
	private Environment environment;

	@Bean
	public DataSource getDataSource() {

		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUrl(environment.getProperty("url"));
		driverManagerDataSource.setUsername(environment.getProperty("user-name"));
		driverManagerDataSource.setPassword(environment.getProperty("password"));
		driverManagerDataSource.setDriverClassName(environment.getProperty("driver-class"));
		return driverManagerDataSource;

	}

	// Hibernate SessionFactory creation

	@Bean
	public LocalSessionFactoryBean getHibernateSession() {

		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(getDataSource());

		Properties props = new Properties();
		props.put("hibernate.show_sql", environment.getProperty("hibernate.show_sql"));
		props.put("hibernate.hbm2ddl.auto", environment.getProperty("hibernate.hbm2ddl.auto"));
		props.put("hibernate.format_sql", environment.getProperty("hibernate.format_sql"));
		props.put("hibernate.dialect", environment.getProperty("hibernate.dialect"));
		sessionFactory.setHibernateProperties(props);
		sessionFactory.setAnnotatedClasses(Product.class);
		//sessionFactory.setAnnotatedPackages("com.cts.product.entity");
		return sessionFactory;

		// sessionFactory.set

	}

	// Hibernate TransactionManager creation
	@Bean
	public HibernateTransactionManager getTransactionManager() {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(getHibernateSession().getObject());
		return transactionManager;
	}
}
