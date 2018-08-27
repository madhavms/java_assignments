package com.inapp.Firstjava.test;

import java.util.HashMap;

public class HashMapTest {
	HashMap<Character,String> map = new HashMap<Character,String>();
public static void main(String[] args) {
	HashMapTest mapTest = new HashMapTest();
	mapTest.hashMap();
	mapTest.getValue();
	mapTest.removeValue();
	mapTest.getValue();
	
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
	System.out.println("\nElements of map before removal: "+map+"\n");
	System.out.println("Hash before removal: "+map.hashCode());
        
}
public void getValue() {
	Character key = 'B';
	if(map.containsKey(key)) 
	System.out.println("The value for the key"+" "+key+" "+"is "+map.get(key)+"\n");
	else
	System.out.println("The value for the key"+" "+key+" "+"is not found \n");
}
public void removeValue() {
	Character key = 'B';
	map.remove(key);
	System.out.println("Elements of map after removal: "+map+"\n");
	System.out.println("Hash after removal: "+map.hashCode());
}

}
