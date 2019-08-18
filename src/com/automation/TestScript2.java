package com.automation;

public class TestScript2 {

		public static void EmployeeModify()
		{
			System.out.println("Change the details");
		}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FrameworkScript fs1 = new FrameworkScript();
		fs1.EmployeeSearch();
		fs1.Login();
		fs1.Logout();
		fs1.Close();
		EmployeeModify();
	}

}
