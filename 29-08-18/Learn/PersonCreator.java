package com.inapp.Firstjava.learn;
import java.util.ArrayList;
import java.util.Iterator;

import com.inapp.Firstjava.learn.Person;
import com.inapp.Firstjava.learn.PersonSorter;

public class PersonCreator {
static ArrayList<Person> arrayList = new ArrayList<Person>();


public static void createPerson(String Name,String Email,long Telephone) {
	
	arrayList.add(new Person(Name,Email,Telephone));
	
}    
public void printPerson() {
	Iterator<Person> personiteratorb = arrayList.iterator();
	System.out.println("before sort\n");
	while (personiteratorb.hasNext()) {
		Person persondetails = personiteratorb.next();
		System.out.println(persondetails);
		
	}
	
	PersonSorter personsorter = new PersonSorter(arrayList); 
	//System.out.println(personsorter.getSortedPersonByName());
	ArrayList<Person> sortedList = personsorter.getSortedPersonByName();
	
	Iterator<Person> personiterator = sortedList.iterator();
	System.out.println("\nafter sort\n");
	while (personiterator.hasNext()) {
		Person persondetails = personiterator.next();
		System.out.println(persondetails);
		
	}
	
}
 
}
