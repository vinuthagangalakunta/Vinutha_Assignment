package com.cg.stringbuffer;

public class Problem1 {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer();
		String s1 = "StringBuffer ", s2 = "is a peer class of string", s3 = " that provides much of ",
				s4 = "the functionality of strings";
		s.append(s1).append(s2).append(s3);
		System.out.println(s);
	}

}