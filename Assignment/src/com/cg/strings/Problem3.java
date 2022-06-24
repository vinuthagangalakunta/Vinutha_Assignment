package com.cg.strings;

public class Problem3 {

	public static void main(String[] args) {

		// Uppercase
		String s1 = "java string pool refers to the collection of strings which are stored in heap memory";
		String s2 = s1.toUpperCase();
		System.out.println("Upper case : " + s2);

		// Lowercase
		String s3 = s2.toLowerCase();
		System.out.println("Lowercase : " + s3);

		// replace a with $
		String replaceString = s1.replace('a', '$');
		System.out.println("Replaced string : " + replaceString);

		// contains
		if (s1.contains("collection")) {
			System.out.println("found in string");
		} else {
			System.out.println("not found in string");
		}

		// matches
		System.out.print("Return Value :");
		System.out.println(s1
				.matches("java string pool refers to the collection" + " of strings which are stored in heap memory"));

	}

}
