package com.automation;

public class Child extends Parent {

	String data = "I am a Child variable named data of String type ";

	public void childMethod() {
//		super();Only inside the constructor we can use
		super.parentMethod();
		System.out.println("I am in parent class data variable" + super.data);
		System.out.println("I am in Child class data variable" + data);
		System.out.println("I am a method in Child class");

	}

	public Child() {
		super("");
		System.out.println("I am Child Class Constructor");
//		super(); Error it is the keyword that must always the first line statement in the constructor ONLY
	}

	public Child(String data) {
		this();
		System.out.println("I am Child Class One Argument Constructor");
//		super(); Error it is the keyword that must always the first line statement in the constructor ONLY
		System.out.println("I am in parent class data variable" + super.data);
		System.out.println("I am in current class instance variable" + this.data);
		System.out.println("I am in current  class local variable" + data);
		
	}

	public Child(String a, int b) {
		super("", 10);
		System.out.println("I am Child Class Two Argument Constructor");
//		super(); Error it is the keyword that must always the first line statement in the constructor ONLY
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Child c1 = new Child();
		Child c2 = new Child("local variable");
//		Child c3 = new Child("", 10);
//		c1.childMethod();
	}

}
