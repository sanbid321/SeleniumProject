package com.automation;

public class Test_Array {
//	int[] id = {11,12,13,14};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] tr = new String[3];
//		tr[0] = "san";
//		tr[1] = "soni";
//		tr[2] = "sanaa";
//		System.out.println(tr[0].length());
//		}
		int[][] id = new int[2][4];
		id[0][0] = 111;
		id[0][1] = 222;
		id[0][2] = 333;
		id[0][3] = 444;
		
		id[1][0] = 555;
		id[1][1] = 666;
		id[1][2] = 777;
		id[1][3] = 888;
		
			System.out.println(id[0][0]);
			System.out.println(id[0][1]);
			System.out.println(id[0][2]);
			System.out.println(id[0][3]);
			
			System.out.println(id[1][0]);
			System.out.println(id[1][1]);
			System.out.println(id[1][2]);
			System.out.println(id[1][3]);
			System.out.println(id.length);
	
	}
}	
