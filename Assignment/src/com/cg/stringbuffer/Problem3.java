package com.cg.stringbuffer;

public class Problem3 {

	public static void main(String[] args) {

		String s1 = "This method returns the reversed object on which it was called";
		StringBuffer s = new StringBuffer(s1);
		s.reverse();
		System.out.println(s);
	}

}