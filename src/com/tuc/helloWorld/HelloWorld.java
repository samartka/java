package com.tuc.helloWorld;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
//		This is single line comment
		/*
		 * This is multi line comments
		 * 
		 */
		showVariable();
		bark();
		convertPrimitive();
	}

	public static void bark() {
		String dogName = "Lucky";
		System.out.println("This dog name = " + dogName + " bark");
	}

	public static void showVariable() {
		int myAge = 25;
		String myName = "Piak";
		double myWeight = 73.5d;
		float fictionCoef = 123.455566666f;
		boolean isStudy = false;
		String[] myToy = new String[] { "Molly", "Silky", "Seally" };
		short myCar = 3;

		System.out.println("This is an Integer : " + myAge);
		System.out.println("This is a String : " + myName);
		System.out.println("This is a Double : " + myWeight);
		System.out.println("This is a Float : " + fictionCoef);
		System.out.println("This is a Boolean : " + isStudy);
		System.out.println("This is a Short : " + myCar);
		for (int i = 0; i < myToy.length; i++) {
			System.out.println("This is an Array at index = " + i + " : " + myToy[i]);
		}

	}

	public static void convertPrimitive() {
		int myInt = 25;
		float myFloat = 2.345f;
		double myDouble = 123.33d;
		char myChar = '\u0205';

		int float2int = (int) myFloat;
		float int2float = (float) myInt;
		float double2float = (float) myDouble;
		int char2int = (int) myChar;
		System.out.println("Float to Integer = " + float2int);
		System.out.println("Integer to Float = " + int2float);
		System.out.println("Double to Float = " + double2float);
		System.out.println("Char to Integer = " + char2int);
	}

	public static void testFinalizeVariable() {
		final String hello = "Hello";
		System.out.println(hello);
		// hello = "World";

	}
}
