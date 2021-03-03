package com.tuc.helloWorld;

public class controlFlow3 {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		sum1to10();
		find12factor();
		arrayLoop();
	}

	public static void sum1to10() {
		int i = 1;
		int sum = 0;
		while (i <= 10) {
			sum = sum + i;
			i++;
		} // TODO Auto-generated method stub
		System.out.println(sum);

	}

	public static void find12factor() {
		int i = 1;
		while (i <= 100) {
			if (i % 12 == 0) {
				System.out.println(i);

			}
			i++;
		}
	}

	public static void arrayLoop() {
		int[] myArray = { 1, 2, 3, 4, 5 };
		for (int i : myArray) {
			System.out.println(i);
		}

	}

}
