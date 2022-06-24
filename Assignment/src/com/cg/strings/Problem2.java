package com.cg.strings;

public class Problem2 {

	public static void main(String[] args) {

		// length of strings

		String string1 = "He11o";
		String string2 = "How are you";

		System.out.println("String 1 is : " + string1);
		System.out.println("String 2 is : " + string2);

		int length1 = string1.length();
		int length2 = string2.length();

		System.out.println("Length of the String 1 is : " + length1);
		System.out.println("Length of the String 2 is : " + length2);

		// Concat strings
		System.out.println("Concatination of two Strings is : " + string1 + " " + string2);
	}
}
