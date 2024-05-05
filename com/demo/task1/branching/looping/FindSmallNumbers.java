package com.demo.task1.branching.looping;

import java.util.Scanner;

public class FindSmallNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number1: ");
		int a = sc.nextInt();

		System.out.println("Please enter number2: ");
		int b = sc.nextInt();

		System.out.println("Please enter number3: ");
		int c = sc.nextInt();

		if (a <= b && a <= c) {

			System.out.println(" The smallest number among the three numbers you've given is" + a);
		}

		else if (b <= a && b <= c) {
			System.out.println(" The smallest number among the three numbers you've given is" + b);
		} else {
			System.out.println(+c + "third number you've given is the smallest among three ");
			
			sc.close();
		}

	}
}
