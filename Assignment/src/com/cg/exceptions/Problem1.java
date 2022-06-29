package com.cg.exceptions;

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			System.out.println("Enter the numerator and denominator: ");
			int n = s.nextInt();
			int d = s.nextInt();
			double r = divide(n, d);
			System.out.println("The quotient is " + r);

		} catch (ArithmeticException e) {
			System.out.println("Can't divide by zero");
		}
		s.close();
	}

	public static double divide(int n, int d) {
		return n / d;
	}
}