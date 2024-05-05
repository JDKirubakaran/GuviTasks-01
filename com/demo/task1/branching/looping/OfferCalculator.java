package com.demo.task1.branching.looping;

import java.util.Scanner;

public class OfferCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the total amount: Rs");
		double amount = sc.nextDouble();

		if ( amount > 0 && amount <= 500) {
			System.out.println("Oops!! No offer will be applied");
		}

		else if (amount > 500 && amount <= 1000) {
			double discountedamount = (amount * 10 / 100);
			double finalAmount = (amount - discountedamount);
			System.out.println("Congrats!! you've got 10% offer!! please pay: Rs." + finalAmount);
		}

		else if (amount > 1000) {
			double discountedamount = (amount * 20 / 100);
			double finalAmount = (amount - discountedamount);
			System.out.println("Congrats!! you've got 20% offer!! please pay: Rs." + finalAmount);
		}

		else {
			System.out.println(" Please enter the valid amount");

			sc.close();
		}
	}

}
