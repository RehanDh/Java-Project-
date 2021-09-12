package com.configuration;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionRestaurant {
	
	public static Connection getConnection() throws SQLException 
	{
		Connection con=null;
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant_ecommerce","root","Rehan@321");
		
		return con;
	}


}



