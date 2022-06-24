package com.cg.oops;

//Singleton is a design pattern involving a class which is responsible to create 
//an object while making sure that only one object gets created.

class Singleton {
	String name;
	private static Singleton s;

	private Singleton() {
		name = "hello";
	}

	static Singleton getInstance() {
		if (s == null)
			s = new Singleton();
		return s;
	}

}