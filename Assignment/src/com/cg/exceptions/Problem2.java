package com.cg.exceptions;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.printf("Enter the numerator and denominator: ");
		int n = s.nextInt();
		int d = s.nextInt();

		try {
			double r = divide(n, d);
			System.out.println("The quotient is: " + r);
		} catch (UnsupportedOperationException e) {
			System.out.printf("Can't divide by zero");
		}

		s.close();
	}

	public static double divide(int n, int d) throws UnsupportedOperationException {
		if (d == 0) {
			throw new UnsupportedOperationException("Exception");
		}
		return n / d;
	}
}

class UnsupportedOperationException extends Exception {

	private static final long serialVersionUID = 1L;

	UnsupportedOperationException(String exception) {
		super(exception);

	}

}