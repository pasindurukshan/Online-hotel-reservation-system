package com.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDBUtil {
		
		private static boolean isSuccess;
		private static Connection con = null;
		private static Statement stmt = null;
		private static ResultSet rs = null;
	
	
		public static boolean validate(String userName, String password) {	
		
		//try catch block use for if any error come display it without terminate program
		try {		
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from employeedb where username='"+userName+"' and password='"+password+"'";	//Query																								
			rs = stmt.executeQuery(sql);																		//Run query
			
			
			//if it is valide
			if(rs.next()) {
				isSuccess = true;								
			} else {
				isSuccess = false;
			}	
							
		}
		catch(Exception e) {
			e.printStackTrace();   //this what is the error
		}
		
		
		return isSuccess;
	}
	
	
		
		
		
//List here		
		
		public static List<Employee> getEmployee(String userName){
			
			ArrayList<Employee> emp = new ArrayList<>();
			
			try {		
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				String sql = "select * from employeedb where username='"+userName+"'";	//Query																								
				rs = stmt.executeQuery(sql);											//Run query
				
				while (rs.next()) {
					int id = rs.getInt(1);
					String name = rs.getString(2);
					String email = rs.getString(3);
					String telephone = rs.getString(4);
					String userU = rs.getString(5);
					String passU = rs.getString(6);
					
					//make object form our previous Employee class and pass this values to constructor in Employee class
					Employee e = new Employee(id,name,email,telephone,userU,passU);                    //pass Employee object (e) to the ArrayList object(emp)
					emp.add(e);	
					
				}
								
			}
			catch(Exception e) {
				e.printStackTrace();   //this what is the error
			}
			
			
			return emp;
		}
				

		
		
//INSERT Part//	
	
	public static boolean insertemployee(String name, String email, String phone, String username, String password) {
		
		boolean isSuccess = false;
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "insert into employeedb values (0,'"+name+"','"+email+"','"+phone+"','"+username+"','"+password+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return isSuccess;
	}
	
	

//Update Part
	

    public static boolean updateemployee(String id, String name, String email, String phone, String username, String password) {
    	
		try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "update employeedb set name='"+name+"',email='"+email+"',telephone='"+phone+"',username='"+username+"',password='"+password+"'"
    				+ "where id='"+id+"'";
    		
    		int rs = stmt.executeUpdate(sql);
    		
    		if(rs > 0) {
    			isSuccess = true;
    		}
    		else {
    			isSuccess = false;
    		}
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	return isSuccess;
    }	
	


 //Retrieve alla data
    
    public static List<Employee> getEmployeeDetails(String Id) {
    	
    	int convertedID = Integer.parseInt(Id);			//This String Id converting into integer
    	
    	ArrayList<Employee> emp = new ArrayList<>();
    	
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "select * from employeedb where id='"+convertedID+"'";
    		rs = stmt.executeQuery(sql);
    		
    		while(rs.next()) {
    			int id = rs.getInt(1);
    			String name = rs.getString(2);
    			String email = rs.getString(3);
    			String phone = rs.getString(4);
    			String username = rs.getString(5);
    			String password = rs.getString(6);
    			
    			Employee e = new Employee(id,name,email,phone,username,password);
    			emp.add(e);
    		}
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}	
    	
    
    	return emp;	
    }
      
    
  
//Delete Part
    
    public static boolean deleteEmployee(String id) {
    	
    	int convId = Integer.parseInt(id);
    	
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "delete from employeedb where id='"+convId+"'";
    		int r = stmt.executeUpdate(sql);
    		
    		if (r > 0) {
    			isSuccess = true;
    		}
    		else {
    			isSuccess = false;
    		}
    		
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
    	
    	return isSuccess;
    }
    	
    
    
}
