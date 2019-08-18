package com.automation;

public class StaticDemo_Part1 {

	static int x;
	static int y;

	public void increment() {
		x++;
		y++;
	}

	public static void display() {
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticDemo_Part1 s1 = new StaticDemo_Part1();
		s1.increment();
		s1.display();
		
		System.out.println("*********");
		StaticDemo_Part1 s2 = new StaticDemo_Part1();
		s2.increment();
		s2.display();
		
		System.out.println("*********");
		StaticDemo_Part1 s3 = new StaticDemo_Part1();
		s3.increment();
		s3.display();
		
		System.out.println("*********");
		StaticDemo_Part1 s4 = new StaticDemo_Part1();
		s4.increment();
		s4.display();
	}

}
