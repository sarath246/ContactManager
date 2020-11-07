package com.codejava.contact.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.codejava.contact.model.Login;

public class LoginDaoImpl implements LoginDao {

	private JdbcTemplate JdbcTemplate;
	
	public LoginDaoImpl(DataSource dataSource) {
		// TODO Auto-generated constructor stub
		
		this.JdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public Login get(String username, String password) {
		// TODO Auto-generated method stub
		
		String sql = "select * from tbl_register where username="+username+"and password="+password;
		ResultSetExtractor<Login> extractor = new ResultSetExtractor<Login>() {

			@Override
			public Login extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				
				if (rs.next()) {
					
					String uname=rs.getString("username");
					String psw=rs.getString("password");
					
				}
				
				return null;
			}
		};
		
		return JdbcTemplate.query(sql, extractor);
	}

}
