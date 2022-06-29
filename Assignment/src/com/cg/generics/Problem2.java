package com.cg.generics;

import java.util.HashMap;
import java.util.Map;

public class Problem2 {

	public static void main(String args[]) {

		Map<Integer, Double> Map = new HashMap<>();
		Map.put(10, 1.0d);
		Map.put(20, 2.0d);
		Map.put(30, 3.0d);
		Map.put(40, 4.0d);
		Map.put(50, 5.0d);
		System.out.println("data stored in the hash map are :");
		for (Map.Entry m : Map.entrySet()) {
			System.out.println(m.getKey() + " :: " + m.getValue());
		}
	}
}