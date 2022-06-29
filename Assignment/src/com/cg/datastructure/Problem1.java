package com.cg.datastructure;
import java.util.Scanner;
//153-1+125+27

public class Problem1 {
	public static void main(String[] args) {
		// Armstrong-if the sum of cubes of its digits is equal to number itself
		Scanner s = new Scanner(System.in);
		int arm = s.nextInt();
		int temp = arm;
		int sum = 0;
		while (temp > 0) {
			int dif = temp % 10;
			sum = sum + dif * dif * dif;
			temp /= 10;
		}
		if (arm == sum) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not Armstrong Number");
		}
	}
}
