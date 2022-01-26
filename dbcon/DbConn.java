package com.revature.ers.dbcon;
import java.sql.*;

public class DbConn {
          public static void main(String args[])throws Exception {
        	  Class.forName("com.mysql.cj.jdbc.Driver");
        	  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db", 
        			  "root","root");
        	  Statement st=con.createStatement();
        	  st.executeUpdate("create table EmployeeDetails(Empid int primary key,Empname varchar(50),Role varchar(20),email varchar(50),password varchar(20))");
      		  
        	  
          }
}
