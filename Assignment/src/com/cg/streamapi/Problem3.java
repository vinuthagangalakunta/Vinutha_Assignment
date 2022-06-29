package com.cg.streamapi;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class Trader {
	String name;
	String city;

	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Trader [name=" + name + ", city=" + city + "]";
	}

}

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Trader> Trader_list = new LinkedList<>();

		Trader_list.add(new Trader("Vivek", "pune"));
		Trader_list.add(new Trader("Dev", "Indore"));
		Trader_list.add(new Trader("Saurav", "delhi"));
		Trader_list.add(new Trader("Aditya", "delhi"));
		Trader_list.add(new Trader("Ayush", "Ahemadabad"));
		Trader_list.add(new Trader("Charu", "pune"));

		// 9. Unique cities where trader work from
		System.out.println("Unique cities where trader work from");
		Trader_list.stream().map(Trader::getCity).distinct().forEach(System.out::println);

		// 10. Trader who are in pune
		System.out.println("Trader in pune");
		Trader_list.stream().filter(x -> x.getCity().contains("pune")).forEach(System.out::println);

		// 11. Trader name sorted alphabetical
		System.out.println("Trader name sorted alphabetical");
		Trader_list.stream().sorted(Comparator.comparing(Trader::getName)).forEach(System.out::println);

		// 12. Are any traders based in indore
		boolean checkindore = Trader_list.stream().anyMatch(x -> x.getCity().contains("Indore"));
		System.out.println("Are there any trader based in indore: " + checkindore);
	}

}