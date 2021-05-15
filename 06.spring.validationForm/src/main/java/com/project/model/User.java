package com.project.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.jboss.logging.Message;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

public class User {
	@NotEmpty(message = "Bu alan bos gecilemez")
	@Size(min = 5,max = 10,message = "Minimum 5,Max 10 karakter olmalidir")
	private String username;
	private String email;
	@NotNull
	@NumberFormat(style = Style.NUMBER)
	@Max(10000)
	@Min(1000)
	private String salary;
	@NotEmpty(message = "Bu alan bos gecilemez")
	@Size(min = 5,max = 10,message = "Minimum 5,Max 10 karakter olmalidir")
	private String password;
	public User() {
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
