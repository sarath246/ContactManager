package com.codejava.contact.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.codejava.contact.model.Login;
import com.codejava.contact.model.Register;

public class RegisterDaoImpl implements RegisterDao {

	private JdbcTemplate JdbcTemplate;
	
	public RegisterDaoImpl(DataSource dataSource) {
		
		this.JdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int saved(Register r) {
		
		String sql = "insert into tbl_register(fname,lname,email,phone,address,username,password,gender,use)values(?,?,?,?,?,?,?,?,?)";
		
		return JdbcTemplate.update(sql,r.getFname(), r.getLname(), r.getEmail(), r.getPhone(), r.getAddress(), r.getUsername(), r.getPassword(), r.getGender(), r.getUse());
		
	}

	@Override
	public Login get(String username, String password) {
		
		String sql = "select * from tbl_register where username="+username+"and password="+password;
		ResultSetExtractor<Login> extractor = new ResultSetExtractor<Login>() {

			@Override
			public Login extractData(ResultSet rs) throws SQLException, DataAccessException {
				
				if (rs.next()) {
					
					String uname=rs.getString("username");
					String psw=rs.getString("password");
					return new Login(uname,psw);
				}
				return null;
			}
		};
		return JdbcTemplate.query(sql, extractor);
	}

	@Override
	public List<Register> list() {
		
		String sql = "select * from tbl_register";
		RowMapper<Register> rowMapper = new RowMapper<Register>() {

			@Override
			public Register mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				String fname=rs.getString("fname");
				String lname=rs.getString("lname");
				String email=rs.getString("email");
				String address=rs.getString("address");
				String contact=rs.getString("phone");
				
				return new Register(fname,lname,email,address,contact);
			}
		};
		return JdbcTemplate.query(sql, rowMapper);
	}
}
