package com.cg.streamapi;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class Fruit {
	String name;
	int calories;
	int price;
	String color;

	public Fruit(String name, int calories, int price, String color) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", calories=" + calories + ", price=" + price + ", color=" + color + "]";
	}
}

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Fruit> Fruit_list = new LinkedList<>();

		Fruit_list.add(new Fruit("Apple", 17, 234, "red"));
		Fruit_list.add(new Fruit("Banana", 15, 230, "yellow"));
		Fruit_list.add(new Fruit("mango", 150, 254, "Yellow"));
		Fruit_list.add(new Fruit("orange", 120, 158, "orange"));

		System.out.println("Fruits with calories less than 100");
		Fruit_list.stream().filter(x -> x.getCalories() < 100).map(Fruit::getName).forEach(System.out::println);

		System.out.println("Sorting fruits according to their color");
		Fruit_list.stream().sorted(Comparator.comparing(Fruit::getColor)).map(Fruit::getName)
				.forEach(System.out::println);

		System.out.println("Only red color fruits");
		Fruit_list.stream().filter(x -> x.getColor().contains("red")).forEach(System.out::println);

	}

}