package com.inapp.Firstjava.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class CollectionTest {
	private String[] fruitsArr = {"Apple","Orange","Banana","Mango","Orange"};
	public static void main(String[] args) {
		CollectionTest collectionsTest = new CollectionTest();
		collectionsTest.testArrayList();
		System.out.println("\n");
		collectionsTest.testArrayListContains();
		System.out.println("\n");
		collectionsTest.testHashSet();
		System.out.println("\n");
		collectionsTest.testTreeSet();
		
	}
	public void testArrayList() {
		
		ArrayList<String> fruits = new ArrayList<String>();
		System.out.println("size of the Arraylist is"+fruits.size());
		System.out.println("Fruits array is"+fruitsArr);
		for (int i = 0; i < fruitsArr.length; i++) {
			fruits.add(fruitsArr[i]);
		}
		System.out.println("AFTER 1: Size of the list is"+fruits.size());
		System.out.println("AFTER 1:Fruits Arraylist is"+fruits);
		for (String currentFruit : fruits) {
			System.out.println("Current fruit is"+currentFruit);
		}
			Iterator<String> fruitsIterator = fruits.iterator();
			while (fruitsIterator.hasNext()) {
				String currentFruit = fruitsIterator.next();
				System.out.println("Current iterated fruit is"+currentFruit);
				
			}
			
	}
	public void testArrayListContains(){
		Collection<String> fruits = new ArrayList<>(); 
		System.out.println("Size of the list is" +fruits.size());
		System.out.println("Fruits array is " +fruitsArr);
		
		for (int i = 0; i < fruitsArr.length; i++) {
			fruits.add(fruitsArr[i]);
		}
		
		System.out.println("AFTER 1 : Size of the list is" +fruits.size());
		System.out.println("AFTER 1 : Fruits list is " +fruits);
		
		
		
	}
	public void testHashSet(){
		Collection<String> fruits = new HashSet<>(); 
		System.out.println("Size of the hash set is" +fruits.size());
		System.out.println("Fruits array is " +fruitsArr);
		
		for (int i = 0; i < fruitsArr.length; i++) {
			fruits.add(fruitsArr[i]);
		}
		
		System.out.println("AFTER 1 : Size of the hash set is" +fruits.size());
		System.out.println("AFTER 1 : Fruits hash set is " +fruits);
		
		for (String currentFruit : fruits) {
			System.out.println("Current fruit is : "+currentFruit);
		}
		
		Iterator<String> fruitsIterator = fruits.iterator();
		while (fruitsIterator.hasNext()) {
			String currentFruit = fruitsIterator.next();
			System.out.println("Current iterated fruit is : "+currentFruit);
		}
		
	}
	
	public void testTreeSet(){
		Collection<String> fruits = new TreeSet<>(); 
		System.out.println("Size of the Treelist is" +fruits.size());
		System.out.println("Fruits array is " +fruitsArr);
		
		for (int i = 0; i < fruitsArr.length; i++) {
			fruits.add(fruitsArr[i]);
		}
		
		System.out.println("AFTER 1 : Size of the Treelist is" +fruits.size());
		System.out.println("AFTER 1 : Fruits Treelist is " +fruits);
		
	}

}

