package com.collections;

public class productDetails {
	private String Name;
	private int Number;
	
public productDetails(String name, int number) {
		super();
		Name = name;
		Number = number;
	}

public String getName() {
	return Name;
}

public int getNumber() {
	return Number;
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Product{" + "name="
 + Name + '\'' + ", weight=" +Number + '}';
}
}
