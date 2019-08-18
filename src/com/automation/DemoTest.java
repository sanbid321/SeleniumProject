package com.automation;

public class DemoTest {



	public static void main(String[] args) {
		//contains is a method in string which verifies a substring in the provided string
		String url = "";
		
		
		//checking that string is empty or not
		if(url.isEmpty()) {
			System.out.println("Empty-true");
		}else {

			System.out.println("Empty-flase");
		}
		
		//checking the substring is present in the string
		if(url.contains(":0")) {
			System.out.println("Contains-true");
		}else {

			System.out.println("Contains-flase");
		}

		
		


	}

}
