package com.emp.management.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	String url = "jdbc:mysql://localhost:3306/employee_data";
	String uname = "root";
	String pass = "malik123";
	
	public Connection getConnection(){
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,uname,pass);
		//System.out.println("Connection Established");
		
		return con;
	}
		catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			return null;
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			return null;
		}
		
	}
	public void closeConnection(Connection con) {
		try {
		con.close();
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	

}
