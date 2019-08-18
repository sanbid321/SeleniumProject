package com.automation;

public class TestScript1 {
	
	public static void EmployeDetails()
	{
		System.out.println("employee details");
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FrameworkScript fs1 = new FrameworkScript();
		fs1.EmployeeSearch();
		fs1.Login();
		fs1.Logout();	
		fs1.Close();
		EmployeDetails();
		
	}

}
