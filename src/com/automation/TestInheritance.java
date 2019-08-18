package com.automation;

public class TestInheritance extends TestRootInheritance{

	public void BookaTicket() {
		System.out.println("BookaTicket");
			}
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		TestRootInheritance rootInheritance = new TestRootInheritance();
		TestInheritance testInheritance = new TestInheritance();
		rootInheritance.OpenBrowser();
		rootInheritance.Login();
		testInheritance.BookaTicket();
		rootInheritance.close();

	}

}
