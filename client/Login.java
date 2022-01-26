package com.revature.ers.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Login {
	
	 String email;
	 String pwd;
	//private static String email;
	 void getdetails()
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Email id");
		 this.email=sc.nextLine();
		 System.out.println("Enter Password");
		 this.pwd=sc.nextLine();
		 sc.close();
	 }
	
	public static void main(String args[]) throws Exception {
		Scanner sc=new Scanner(System.in);
		
		Class.forName("com.mysql.cj.jdbc.Driver");
  	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","root");
  	    Statement st=con.createStatement();
  	    
  	    System.out.println("Welcome! Choose your portal to login!! 1.EmployeeLogin 2.ManagerLogin");
  	    int ch=sc.nextInt();
  	    switch(ch) {
  	    case 1:
  	    	Login l=new Login();
  	    	l.getdetails();
  	    	String email2 = null;
  	    	String password=null;
  	    	PreparedStatement pst=con.prepareStatement("select * from EmployeeDetails where email=? and password=?");
  	    	pst.setString(1,l.email);
  	    	pst.setString(2,l.pwd);
  	    	ResultSet rs=pst.executeQuery();
  	    	
  	    	
  	    	while( rs.next()) {
  	    		System.out.println("1");
  	    		email2=rs.getString("email");
  	    		password=rs.getString("password");
  	    	if(email2.equals(l.email)&& password.equals(l.pwd))
  	    	{
  	    		System.out.println("2");
  	    		Integer userid=rs.getInt("empid");
  	    		String name=rs.getString("empname");
  	    		String role=rs.getString("role");
  	    		String email1=rs.getString("email");
  	    		String password1=rs.getString("password");
  	    		
  	    		System.out.println(userid);
  	    		System.out.println(name);
  	    		
  	    		//EmployeeClient emp=new EmployeeClient(userid,name,role,email1,password1);
  	    		EmployeeClient emp=new EmployeeClient();
  	    		emp.accept(emp);
  	    		System.out.println("4");
  	    	}
  	    	else {
  	    		System.out.println("Please check your login details");
  	    	}
  	    	
  	    	
  	    	}
  	    }
		
	}

	//private static void accept(EmployeeClient emp) {
		
		//System.out.println("5");
	//}

}
