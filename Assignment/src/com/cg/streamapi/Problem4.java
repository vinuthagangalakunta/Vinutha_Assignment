package com.cg.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Transaction {
	Trader t;
	int year;
	int value;

	public Transaction(Trader t, int year, int value) {
		super();
		this.t = t;
		this.year = year;
		this.value = value;
	}

	public Trader getT() {
		return t;
	}

	public void setT(Trader t) {
		this.t = t;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Transaction [t=" + t + ", year=" + year + ", value=" + value + "]";
	}

}

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Transaction> Trans_list = Arrays.asList(new Transaction(new Trader("vivek", "Delhi"), 2012, 4500),
				new Transaction(new Trader("Hardik", "Delhi"), 2011, 4800),
				new Transaction(new Trader("ashu", "Indore"), 2011, 4400));

		// 8. Transaction of a particular year
		System.out.println("Transaction of year 2011");
		Trans_list.stream().filter(x -> x.getYear() == 2011).sorted(Comparator.comparing(Transaction::getValue))
				.forEach(System.out::println);

		// 13. Transaction from traders living in delhi
		System.out.println("Transaction from traders living in delhi");
		Trans_list.stream().filter(x -> x.getT().getCity().contains("Delhi")).map(Transaction::getValue)
				.forEach(System.out::println);

		// 14. Highest transaction value
		System.out.println("Highest Transaction value");
		Trans_list.stream().sorted(Comparator.comparing(Transaction::getValue).reversed()).limit(1)
				.forEach(System.out::println);

		// 15. Transaction with smallest value
		System.out.println("Transaction with smallest value");
		Trans_list.stream().sorted(Comparator.comparing(Transaction::getValue)).limit(1).forEach(System.out::println);

	}

}