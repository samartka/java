package com.tuc.helloWorld;

public class methodTest {
	public static void main(String[] args) {
		showGreeting();
		System.out.println(multiplyBetween(5, 8));
		
	}
	
	
	
	public static void showGreeting() {
		System.out.println("Greeting from non return method");
	}
	
	public static int multiplyBetween(int a, int b) {
		return a*b;
	}
	
	
}
