package com.automation;

public class TestInheritance1 extends TestRootInheritance{
	
	
	public void PrintaTicket() {
		System.out.println("PrintaTicket");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestRootInheritance rootInheritance = new TestRootInheritance();
		TestInheritance1 testInheritance2 = new TestInheritance1();
		rootInheritance.OpenBrowser();
		rootInheritance.Login();
		testInheritance2.PrintaTicket();
		rootInheritance.close();

	}

}
