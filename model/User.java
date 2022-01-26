package com.revature.ers.model;

public class User {
	Integer userid;
	String name;
	String role;
	String email;
	String password;
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		 this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		 this.password = password;
	}
	public User(Integer userid, String name, String role, String email, String password) {
		super();
		this.userid = userid;
		this.name = name;
		this.role = role;
		this.email = email;
		this.password = password;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", name=" + name + ", role=" + role + ", email=" + email + ", password="
				+ password + "]";
	}
	
	
	

}
