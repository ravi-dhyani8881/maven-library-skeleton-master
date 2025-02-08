package com.main.external.model;


import javax.validation.constraints.NotEmpty;



public class User {

	
	@NotEmpty(message = "Email is mandatory")
	public String username;
	@NotEmpty(message = "Password is mandatory")
	public String password;
	public String role;
	
	public User(@NotEmpty(message = "Email is mandatory") String username,
			@NotEmpty(message = "Password is mandatory") String password, String role) {
		super();
		this.username = username;
		this.password = password;
	
		this.role = role;
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}