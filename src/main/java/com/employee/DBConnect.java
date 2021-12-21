package com.employee;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	//Declare
	private static String url = "jdbc:mysql://localhost:3306/hotel";
	private static String userName = "root";
	private static String password = "1523";
	private static Connection con;
	

	//database connectivity (getConnection)
	public static Connection getConnection() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url, userName, password);
		}
		catch(Exception e) {
			System.out.print("Database connection is not success!!!");
		}
		
		return con;
		
	}
	
}
