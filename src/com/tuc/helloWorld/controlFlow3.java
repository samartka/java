package com.tuc.helloWorld;
import java.util.Scanner; 
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
		printHighToLow();
		showOnlyEven();
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
	
	public static void printHighToLow() {
		int i = 20;
		do {
			System.out.println(i);
			i--;
		}
		while (i > 0);

	}	
	
	public static void showOnlyEven() {
		Scanner console = new Scanner(System.in);
		int inputNum ;
		do {
			System.out.print("Enter number (will be exit if odd number was inputted !) ");
		    inputNum = console.nextInt();
		    if (inputNum%2==0) System.out.println(inputNum);
		}
		while(inputNum%2==0);
		console.close();

	}

}
