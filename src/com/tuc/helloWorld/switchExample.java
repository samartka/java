package com.tuc.helloWorld;

public class switchExample {
	public static void main(String[] args) {
		int score = 76;
		switch (score) {
		case 80: 
			System.out.println("A");
			break;
		case 70: 
			System.out.println("B");
			break;
		case 60: 
			System.out.println("C");
			break;
		case 50: 
			System.out.println("D");
			break;
		case 40: 
			System.out.println("F");
			break;			
		default:
			System.out.println("E");		
		}
	}

}
