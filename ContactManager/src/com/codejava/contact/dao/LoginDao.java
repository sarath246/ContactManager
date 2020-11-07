package com.codejava.contact.dao;

import com.codejava.contact.model.Login;

public interface LoginDao {

	public Login get(String username, String password);
	
}
