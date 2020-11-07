package com.javacode.dao;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.codejava.contact.dao.RegisterDao;
import com.codejava.contact.dao.RegisterDaoImpl;
import com.codejava.contact.model.Register;

public class RegisterDaoTest {

	private DriverManagerDataSource dataSource;
	private RegisterDao dao;
	
	@BeforeEach
	void setupBeforeEach() {

		dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/db_contact");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		
		dao = new RegisterDaoImpl(dataSource);
		
	}
	@Test
	void testSave() {

		Register register = new Register("Sundar pichei", "sundar@google.com", "washigton,VAM", "1700521563159","dfjgn","djfn","dfn","jdf","dkjfn");
		int result = dao.saved(register);
		assertTrue(result > 0);
	}
	
}
