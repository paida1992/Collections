package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		productDetails table = new productDetails("WoodenTable", 35);
		productDetails chair = new productDetails("Plastic chairs",45);
		productDetails tableCover = new productDetails("Plastic Cover", 10);
		
		Collection<productDetails> products = new ArrayList<>();
		products.add(table);
		products.add(tableCover);
		System.out.println(products);

	}

}
