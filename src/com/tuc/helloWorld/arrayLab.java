package com.tuc.helloWorld;

public class arrayLab {

	public static void main(String[] args) {
		int[][] myArray = { { 1, 3, 7 }, { 6, 5, 3 }, { 9, 4, 4 }, { 2, 4, 5 }, { 7, 8, 9 } };
		arrayLoop(myArray);
		System.out.println("Sum of last elements from each rows = " + sumLastRowElement(myArray));
	}

	public static void arrayLoop(int[][] _array) {
		for (int[] rows : _array) {
			for(int element : rows) {
				System.out.println(element);
			}
		}
	}
	public static int sumLastRowElement(int[][] _array) {
		int sum = 0;
		for (int[] rows : _array) {
			sum = sum + rows[rows.length-1];
		}
		return sum;
	}


}
