package com.inapp.Firstjava.test;
import com.inapp.Firstjava.learn.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class PersonTest {
	
public static void main(String[] args) {
	ArrayList<Person> arrayList = new ArrayList<Person>();
	arrayList.add(new Person("Tony","tony@tmail.com",790660987));
	arrayList.add(new Person("Alan","alan@tmail.com",735640987));
	arrayList.add(new Person("Darren","darren@tmail.com",719350987));
	arrayList.add(new Person("Quill","quill@tmail.com",785401987));
	arrayList.add(new Person("Peter","peter@tmail.com",775643077));
	Iterator<Person> personiteratorb = arrayList.iterator();
	System.out.println("before sort\n");
	while (personiteratorb.hasNext()) {
		Person personname = personiteratorb.next();
		System.out.println("Person is"+personname);
		
	}
	PersonSorter personsorter = new PersonSorter(arrayList); 
	//System.out.println(personsorter.getSortedPersonByName());
	ArrayList<Person> sortedList = personsorter.getSortedPersonByName();
	
	Iterator<Person> personiterator = sortedList.iterator();
	System.out.println("\nafter sort\n");
	while (personiterator.hasNext()) {
		Person personname = personiterator.next();
		System.out.println("Person is"+personname);
		
	}
	
}

      
 
}

