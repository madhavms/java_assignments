package com.inapp.Firstjava.test;

import java.util.HashMap;
import java.util.Set;

public class HashMapTest {
	HashMap<Character,String> map = new HashMap<Character,String>();
public static void main(String[] args) {
	HashMapTest mapTest = new HashMapTest();
	mapTest.hashMap();
	
}
public void hashMap() {
	
	map.put('A',"APPLE");
	map.put('B',"BOY");
	map.put('C',"CAT");
	map.put('D',"DOG");
	map.put('E',"ELEPHANT");
	map.put('F',"FOX");
	map.put('G',"GOAT");
	map.put('H',"HEN");
	map.put('I',"INK");
	map.put('J',"JUG");
	Set<Character> keys= map.keySet();
	for(char key : keys)
		System.out.println("The value for key "+key+" is "+map.get(key));
	
}

}
