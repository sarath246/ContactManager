package com.codejava.contact.config;

import javax.sql.DataSource;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.ResourceBundleViewResolver;

import com.codejava.contact.dao.ContactDao;
import com.codejava.contact.dao.ContactDaoImpl;
import com.codejava.contact.dao.RegisterDao;
import com.codejava.contact.dao.RegisterDaoImpl;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.codejava.contact")
public class SpringMvcConfig implements WebMvcConfigurer {
	
	@Bean
	public DataSource getDataSource() {
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/db_contact");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
	}
	
	@Bean
	public ViewResolver getViewResolver() {
		
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	@Bean
	public MessageSource getMessageSource() {
		
		ResourceBundleMessageSource resolver = new ResourceBundleMessageSource();
		resolver.setBasenames("resources/messages");
		return resolver;
	} 
	// define bean
	
	@Bean
	public ContactDao getContactDao() {
		
		return new ContactDaoImpl(getDataSource());
	}
	// define bean and inject dependency , the getDatasource from the ContactDaoImpl java class
	@Bean
	public RegisterDao getRegisterDao() {
		
		return new RegisterDaoImpl(getDataSource());
	}
}
