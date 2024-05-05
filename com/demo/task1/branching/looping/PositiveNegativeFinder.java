package com.demo.task1.branching.looping;

import java.util.Scanner;

public class PositiveNegativeFinder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int i = sc.nextInt();

		if (i >= 1) {
			System.out.println("The number is positive ");
		} else if (i < 0) {
			System.out.println("The number is Negative");
		} else {
			System.out.println(" The number you've entered is Zero, Zero is neither +ve nor -Ve");
			sc.close();
		}

	}

}
