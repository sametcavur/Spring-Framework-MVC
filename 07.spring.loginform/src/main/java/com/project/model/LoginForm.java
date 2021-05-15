package com.project.model;

import javax.validation.constraints.NotEmpty;

import javax.validation.constraints.Size;

public class LoginForm {
	@NotEmpty
	@Size(min = 3,max = 10,message = "3 ila 10 karakter arasýnda giriniz")
	private String username;
	@NotEmpty
	@Size(min = 3,max = 10,message = "3 ila 10 karakter arasýnda giriniz")
	private String password;
	public LoginForm() {
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
}
