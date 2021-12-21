package com.employee;

public class Employee {
	private int id;
	private String name;
	private String email;
	private String telephone;
	private String userName;
	private String password;
	
	public Employee(int id, String name, String email, String telephone, String userName, String password) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.telephone = telephone;
		this.userName = userName;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getTelephone() {
		return telephone;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}
	
}
