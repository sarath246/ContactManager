package com.codejava.contact.model;

import java.util.LinkedHashMap;

public class Register {

	private Integer id;
	private String fname;
	private String lname;
	private String email;
	private String phone;
	private String address;
	private String username;
	private String password;
	private String gender;
	private String use;
	
	private LinkedHashMap<String, String> genderOptions;

	public Register() {
		
		// populate gender options
		
		genderOptions = new LinkedHashMap<String, String>();
		genderOptions.put("M", "Male");
		genderOptions.put("F", "Female");
		genderOptions.put("O", "Others");

	}

	public Register(Integer id, String fname, String lname, String email, String phone, String address, String username,
			String password, String gender, String use) {
		this(fname, lname, email, address, phone, username, password, gender, use);
		this.id = id;
	}

	public Register(String fname, String lname, String email, String phone, String address, String username,
			String password, String gender, String use) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.username = username;
		this.password = password;
		this.gender = gender;
		this.use = use;
	}

	public Register(String fname, String lname,String email, String address, String phone) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.address = address;
		this.phone = phone;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getUse() {
		return use;
	}

	public void setUse(String use) {
		this.use = use;
	}
	
	public LinkedHashMap<String, String> getGenderOptions() {
		return genderOptions;
	}

	@Override
	public String toString() {
		return "Register [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", phone=" + phone
				+ ", address=" + address + ", username=" + username + ", password=" + password + ", gender=" + gender + ",use=" + use + "]";
	}

}
