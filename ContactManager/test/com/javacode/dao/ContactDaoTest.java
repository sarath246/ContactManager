package com.javacode.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.codejava.contact.dao.ContactDao;
import com.codejava.contact.dao.ContactDaoImpl;
import com.codejava.contact.model.Contact;

class ContactDaoTest {

	private DriverManagerDataSource dataSource;
	private ContactDao dao;
	
	@BeforeEach
	void setupBeforeEach() {
		// TODO Auto-generated method stub

		dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/db_contact");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		
		dao = new ContactDaoImpl(dataSource);
		
	}
	
	
	@Test
	void testSave() {
//		fail("Not yet implemented");

		Contact contact = new Contact("Sundar pichei", "sundar@google.com", "washigton,VAM", "1700521563159");
		int result = dao.save(contact);
		assertTrue(result > 0);
	}

	@Test
	void testUpdate() {
		//fail("Not yet implemented");
		try {
			
		Contact contact = new Contact(2,"Bill gates", "bill@microsoft.com", "california,BM", "17005215655659");
		int result = dao.update(contact);
		assertTrue(result > 0);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Test
	void testGet() {
		//fail("Not yet implemented");
		Integer id = 1;
		Contact contact =  dao.get(id);
		if (contact!=null) {
			System.out.println(contact);
		}
		assertNotNull(contact);
	}

	@Test
	void testDelete() {
		//fail("Not yet implemented");
		Integer id = 2;
		int result = dao.delete(id);
		assertTrue(result > 0);
	}

	@Test
	void testList() {
		//fail("Not yet implemented");
		List<Contact> listContacts = dao.list();
		for (Contact acontact : listContacts) {
			System.out.println(acontact);
		}
		assertTrue(!listContacts.isEmpty());
	}

}
