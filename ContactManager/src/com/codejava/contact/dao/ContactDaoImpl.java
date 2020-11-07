package com.codejava.contact.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.codejava.contact.model.Contact;

public class ContactDaoImpl implements ContactDao {
	
	private JdbcTemplate JdbcTemplate;

	public ContactDaoImpl(DataSource dataSource) {					// Constructor injection
		
		this.JdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int save(Contact c) {
		
		String sql="insert into tbl_contact(name,email,address,phone)values(?,?,?,?)";
		return JdbcTemplate.update(sql, c.getName(), c.getEmail(), c.getAddress(), c.getPhone());
	}

	@Override
	public int update(Contact c) {
		
		String sql="update tbl_contact set name=?,email=?,address=?,phone=? where id=?";
		return JdbcTemplate.update(sql, c.getName(), c.getEmail(), c.getAddress(), c.getPhone(), c.getId());
	}

	@Override
	public Contact get(Integer id) {
		// TODO Auto-generated method stub
		String sql = "select * from tbl_contact where id=" + id;
		ResultSetExtractor<Contact> extractor = new ResultSetExtractor<Contact>() {

			@Override
			public Contact extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				if (rs.next()) {
					
					String name = rs.getString("name");
					String email = rs.getString("email");
					String address = rs.getString("address");
					String phone = rs.getString("phone");
					
					return new Contact(id,name, email, address, phone);
				}
				return null;
			}
		};
		return JdbcTemplate.query(sql, extractor);
	}

	@Override
	public int delete(Integer id) {
		
		String sql="delete from tbl_contact where id =" + id;
		return JdbcTemplate.update(sql);
	}

	@Override
	public List<Contact> list() {
		
		String sql = "select * from tbl_contact";
		org.springframework.jdbc.core.RowMapper<Contact> rowMapper = new org.springframework.jdbc.core.RowMapper<Contact>() {
			
			@Override
			public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				
				Integer id=rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String address = rs.getString("address");
				String phone = rs.getString("phone");
				
				return new Contact(id,name, email, address, phone);
			}
		};
		return JdbcTemplate.query(sql, rowMapper);
	}

}
