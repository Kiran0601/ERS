package com.revature.ers.service;

import java.util.ArrayList;
import java.util.Iterator;

//import com.pro.model.Product;
import com.revature.ers.model.Form;
//import com.revature.ers.model.User;

public class serviceImpl implements Service{
	static ArrayList<Form> erslist=new ArrayList<Form>();

	@Override
	public void submitRequest(Form f) {
		erslist.add(f);
		System.out.println(erslist);
		
	}
	@Override
	public void login(String email,String password) {
		
	}

	@Override
	public void viewResolvedRequest(int userid) {
		for(Form form:erslist) {
			System.out.println("Yes");
			if(form.getStatus()=="Resolved") {
				System.out.println("Ye Yes");
				System.out.println(form);
			}
		}
	}

	@Override
	public void viewPendingRequest(int userid) {
		Iterator<Form> i=erslist.iterator();
		while(i.hasNext()) {
			System.out.println("Yes");
			Form f=i.next();
			   String sta=f.getStatus();
			   System.out.println(sta);
			if(sta.equals("Pending")) {
				System.out.println("Yes Yes");
			System.out.println(f);}
				
		}
		
	}

	@Override
	public void ManagerResolvedRequest() {
		Iterator<Form> i=erslist.iterator();
		while(i.hasNext()) {
			Form f=i.next();
			if(f.getStatus()=="Resolved") {
			System.out.println(f);}
				
		}
		
	}

	@Override
	public void ManagerPendingRequest() {
		Iterator<Form> i=erslist.iterator();
		while(i.hasNext()) {
			Form f=i.next();
			if(f.getStatus()=="Resolved") {
			System.out.println(erslist);}
				
		}
		
	}
	@Override
	public void view()
	{
		if(erslist.isEmpty()) {
	
		System.out.println("Sorry :( No Products Available");
	}
	else {
		System.out.println("EMPLOYEES ARE: ");
		for (Form  form : erslist) {
			System.out.println(form);
		}
	}



}
}