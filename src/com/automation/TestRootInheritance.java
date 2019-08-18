package com.automation;

public class TestRootInheritance {

	public void OpenBrowser() {
		System.out.println("Open Broswer");
	}

	public void Login() {
		System.out.println("Login");
	}

	public void BookaTicket() {
		System.out.println("BookaTicket");
	}

	public void PrintaTicket() {
		System.out.println("PrintaTicket");
	}

	public void close() {
		System.out.println("close");
	}
	
	  public static void main(String[] args) { // TODO Auto-generated method stub
	  
	  
	  TestRootInheritance rootInheritance = new TestRootInheritance();
	  
	  rootInheritance.OpenBrowser(); rootInheritance.Login();
	  rootInheritance.BookaTicket(); rootInheritance.PrintaTicket();
	  rootInheritance.close();
	  
	  }
	 
}
