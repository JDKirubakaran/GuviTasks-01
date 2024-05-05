package com.demo.task1.branching.looping;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to reverse: ");
		int num = sc.nextInt();
		int reversedNumber =0;
		
		while (num > 0) {
			int remainder = num %10;
			reversedNumber = reversedNumber *10 + remainder;
			num /=10;
		}
		System.out.println(reversedNumber);
		sc.close();
	}
}

		


