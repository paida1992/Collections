package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		productDetails table = new productDetails("WoodenTable", 35);
		productDetails chair = new productDetails("Plastic chairs",45);
		productDetails tableCover = new productDetails("Plastic Cover", 10);
		
		Collection<productDetails> products = new ArrayList<>();
		products.add(table);
		products.add(chair);
		products.add(tableCover);
		
		System.out.println(products);
		//Iterative concept in order to Print all the elements one after the other
		
		Iterator<productDetails> prodIter = products.iterator();
		while(prodIter.hasNext()){ //has Next once it reaches end of the list it terminates
			 productDetails prod = prodIter.next();//it gives next element and moves forward 
			System.out.println(prod);
		}

	}

}
