package com.automation;

public class Test_Variables {
	
	int a = 100;
	String st  = "soni";
	static int x = 222;
	boolean b;
	Test_Variables(int a, String st)
	{	
		System.out.println(a);
		System.out.println(st);
	}
	void disp()
	{
		System.out.println(a);
		System.out.println(st);
		System.out.println(b);
	}
	static int m1()
	{
		System.out.println(x);
		return x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		String s = "santanu";
		double sal = 35000;
		char ch = 'M';
		
		Test_Variables tv = new Test_Variables(4, "san");
		
		tv.m1();
		tv.disp();
		System.out.println("print my value "+ i);
		System.out.println("print my value "+ ch);
	}
		
}
