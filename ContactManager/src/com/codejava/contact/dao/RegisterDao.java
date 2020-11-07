package com.codejava.contact.dao;

import java.util.List;

import com.codejava.contact.model.Login;
import com.codejava.contact.model.Register;

public interface RegisterDao {

	public int saved(Register register);
	
	public Login get(String username,String password);
	
	public List<Register> list();
	
}
