package com.automation;

public class TestEmployee {

	int id;
	String FristName;
	String Lastname;
	double salary;
	
	public void EmpDetails(int empid, String empFirstname, String empLastname, double empSalary)
	{
		id = empid;
		FristName = empFirstname;
		Lastname = empLastname;
		salary = empSalary;
	}
	
	public void EmpDetails1(int empid, String empFirstname, String empLastname, double empSalary)
	{
		id = empid;
		FristName = empFirstname;
		Lastname = empLastname;
		salary = empSalary;
	}
	
	public void EmpInfo()
	{
		System.out.println(id);
		System.out.println(FristName);
		System.out.println(Lastname);
		System.out.println(salary);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}

}
