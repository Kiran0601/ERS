package com.revature.ers.dbcon;
import java.sql.*;

public class DBConnection {
	public static Connection getConnection() {
	    Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
      	    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", 
      			  "root","root");
      	    
      	    
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return con;
	}
}
