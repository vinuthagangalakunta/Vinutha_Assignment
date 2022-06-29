package com.cg.lamda;

import java.util.function.BiFunction;

public class Problem1 {

	public static void main(String[] args) {

		// Lambda expression for addition
		BiFunction<Integer, Integer, Integer> funcAddObj = (i1, i2) -> i1 + i2;

		// Lambda expression for subtract
		BiFunction<Integer, Integer, Integer> funcSubtractObj = (i1, i2) -> i1 - i2;

		// Lambda expression for multiply
		BiFunction<Integer, Integer, Integer> funcMuliplyObj = (i1, i2) -> i1 * i2;

		// Lambda expression for division
		BiFunction<Integer, Integer, Integer> funcDivideObj = (i1, i2) -> i1 / i2;

		// Lambda expression for division
		BiFunction<Integer, Integer, Integer> funcModuloObj = (i1, i2) -> i1 % i2;

		System.out.println("Addition of 10 and 5: " + funcAddObj.apply(10, 5));
		System.out.println("Subtract of 10 and 5: " + funcSubtractObj.apply(10, 5));
		System.out.println("Multiply of 10 and 5: " + funcMuliplyObj.apply(10, 5));
		System.out.println("Division of 10 and 5: " + funcDivideObj.apply(10, 5));
		System.out.println("Modulo of 10 and 5: " + funcModuloObj.apply(10, 5));

	}

}