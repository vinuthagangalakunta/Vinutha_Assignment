package com.cg.oops;

abstract class Bank {
	abstract public void disp();
}

class Savings_Account extends Bank {
	double bal;
	double fd;

	public Savings_Account(double bal, double fd) {
		this.bal = bal;
		this.fd = fd;
	}

	public void disp() {
		System.out.println("Total money in saving:" + (bal + fd));
	}

	public double get() {
		return bal + fd;
	}
}

class Current_Account extends Bank {
	double bal;
	double cc;

	public Current_Account(double bal, double cc) {
		this.bal = bal;
		this.cc = cc;
	}

	public void disp() {
		System.out.println("Total money in current: " + (bal + cc));
	}

	public double get() {
		return bal + cc;
	}
}

public class Problem3 {
	public static void main(String[] args) {
		Savings_Account s = new Savings_Account(30000, 4000);
		Current_Account c = new Current_Account(500000, 20000);
		s.disp();
		c.disp();
		double totalAmount = s.get() + c.get();
		System.out.println("The total money in bank: " + totalAmount);
	}
}