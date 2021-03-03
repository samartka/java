package com.tuc.helloWorld;

public class controlFlow4 {

	public static void main(String[] args) {
		breakTest();
		continueTest();
		skip2();
	}

	public static void breakTest() {
		int count = 20;
		for (int i = 1; i <= count; i++) {
			System.out.println(i);
			if (i == 11)
				break;
		}
	}

	public static void continueTest() {
		int count = 20;
		for (int i = 1; i <= count; i++) {
			System.out.println(i);
			if (i == 11)
				continue;
			System.out.println("Next i please");

		}
	}
	
	public static void skip2() {
		int count = 10;
		for (int i = 1; i <= count; i++) {
			if (i == 2)
				continue;
			System.out.println(i);

		}
	}	
	
}
