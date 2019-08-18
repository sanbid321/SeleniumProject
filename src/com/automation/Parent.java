package com.automation;

public class Parent {
	
	
	String data="I am a Parent variable named data of String type ";

	public void parentMethod()
	{
		System.out.println("I am a method in Parent class");
	}
	
	public	Parent()
	{
		System.out.println("I am Parent Class Constructor");
	}
	
	public Parent(String a)
	{
		System.out.println("I am Parent Class One Argument Constructor");
	}
	
	public Parent(String a,int b)
	{
		System.out.println("I am Parent Class Two Argument Constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Parent p= new Parent();
//		Parent p1 =new Parent("");
	}

}
