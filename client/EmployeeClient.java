package com.revature.ers.client;

import java.util.Scanner;

import com.revature.ers.model.Form;
import com.revature.ers.model.User;
import com.revature.ers.service.Service;
import com.revature.ers.service.serviceImpl;

public class EmployeeClient {
	static Integer userid;
    String name;
    String role;
     String email1;
     String password1;
      public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getEmail1() {
		return email1;
	}
	public void setEmail1(String email1) {
		this.email1 = email1;
	}
	public String getPassword1() {
		return password1;
	}
	public void setPassword1(String password1) {
		this.password1 = password1;
	}
	public EmployeeClient(Integer userid, String name, String role, String email1, String password1) 
      {
    	  super();
    	  this.userid=userid;
    	  this.name=name;
    	  this.role=role;
    	  this.email1=email1;
    	  this.password1=password1;
      }
      public EmployeeClient() {}
      @Override
  	public String toString() {
  		return "EmployeeClient [userid=" + userid + ", name=" + name + ", role=" + role + ", email1=" + email1
  				+ ", password1=" + password1 + "]";
  	}
      
    	  
      //public static void main(String args[])
	public void accept(EmployeeClient e)
      {
    	  Service s=new serviceImpl();
    	  Login l=new Login();
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("Reached");
    	  System.out.println(userid);
    	  int ch1 = 0;
    	  System.out.println("Enter CH1");
    	      ch1=sc.nextInt();
    	 
    	  //sc.nextLine();
    	  int rep;
    	  if(ch1==1) {
    	  System.out.println("=====Choose the option you need to perform=====");
    	  System.out.println("1.submit new form   2.viewpendingform  3.viewresolvedform ");
    	 
    	  do {
    		  int ch=sc.nextInt();
    	  switch(ch) {
    	  
    	  case 1:{
    		  System.out.println("Enter form details");
    		  Form f=new Form();
    		  System.out.println("Enter form number");
    		  f.setFormNumber(sc.nextInt());
    		  sc.nextLine();
    		  System.out.println("Enter userid");
    		  f.setUserid(sc.nextLine());
    		  System.out.println("Enter amount");
    		  f.setAmount(sc.nextInt());
    		  System.out.println("Enter submissiondate");
    		  f.setSubmissionDate(sc.nextLine());
    		  System.out.println("Enter resolveddate");
   		  f.setResolvedDate(sc.nextLine());
    		  System.out.println("Enter status");
    		  f.setStatus(sc.nextLine());
    		  System.out.println("Enter typeofExpense");
    		  f.setTypeOfExpense(sc.nextLine());
    		  s.submitRequest(f);
    		  break;}
    	  case 2:{
    		  System.out.println("Enter userid");
    		  int c=sc.nextInt();
    		  s.viewPendingRequest(c);
    		  break;}
    	  case 3:{
    		  System.out.println("Enter userid");
    		  int ch2=sc.nextInt();
    		  s.viewPendingRequest(ch2);
    		  break;
    	  }
    	  case 4:
    	  {
    		  s.view();
    		  break;
    	  }
    		  
    	
          }
    	  rep=sc.nextInt();
    	  }while(rep<=2);
    	  
      }
    	  }}

	
      

