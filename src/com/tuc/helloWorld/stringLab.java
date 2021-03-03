package com.tuc.helloWorld;

public class stringLab {

	public static void main(String[] args) {
		stringFromChars();
		stringLab12();
	}
	public static void stringFromChars() {
		char[] myChar = {'S','a','m','a','r','t'};
		String myString = new String(myChar);
		System.out.println(myString);
	}
	
	public static void stringLab12() {
		String String1 = "You and Me";
		String String2 = " you and me ";
		
		System.out.println("Is String1 equals to String2 :" + String1.equals(String2));
		System.out.println("Find Me in String1 :" + String1.contains("Me"));
		System.out.println("String1 has a length of: " + String1.length());
		System.out.println("String1 at index 1 to 4: " + String1.substring(1, 5));
		System.out.println("String2 after was trimmed :" + String2.trim());
		System.out.println("String1 was changed to :" + String1.toUpperCase());
		System.out.println("String2 was trimmed and changed to :" + String2.trim().toUpperCase());
		
				
		
		
		
		
		
	}
}
