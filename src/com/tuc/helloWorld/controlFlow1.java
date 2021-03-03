package com.tuc.helloWorld;

public class controlFlow1 {

	public static void main(String[] args) {
		int score = 75;
		if (score >= 80) {
			System.out.println("Good");
		} else if (score >= 50) {
			System.out.println("Normal");
		} else {
			System.out.println("Fail");
		}

		boolean isHandsome = true;
		if (isHandsome) {
			System.out.println("Good");
		} else {
			if (score >= 80) {
				System.out.println("Good");
			} else if (score >= 50) {
				System.out.println("Normal");
			} else {
				System.out.println("Fail");
			}
		}

	}

}
