package com.inapp.Firstjava.learn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Person {
	
	private String name;
	private String email;
	private long telephone;
	static ArrayList<Person> arrayList = new ArrayList<Person>();
	ArrayList<Person> person = new ArrayList<>();
	
	public Person() {
		
	}
	
	public void createPerson(String Name,String Email,long Telephone) {
		
		arrayList.add(new Person(Name,Email,Telephone));
		
	}    
	public ArrayList<Person> getPersonByName() throws IOException {
		ArrayList<Person> personByName = new ArrayList<>();
		System.out.println("\nEnter the Name: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String S = reader.readLine();
		for(Person personObject:arrayList) {
			
			if(personObject.toString().toLowerCase().contains(S.toLowerCase())) {
				
				personByName.add(personObject);
			}
		}
		return personByName;
	}
	public void printPerson() {
	
		
		Person personsorter = new Person(arrayList); 
		//System.out.println(personsorter.getSortedPersonByName());
		ArrayList<Person> sortedList = personsorter.getSortedPersonByName();
		
		Iterator<Person> personiterator = sortedList.iterator();
		System.out.println(" \nSorted Namewise\n");
		while (personiterator.hasNext()) {
			Person persondetails = personiterator.next();
			System.out.println(persondetails);
			
		}
		
	}
public Person(ArrayList<Person> person) {         
	    this.person = person;     
	  } 
  
  public ArrayList<Person> getSortedPersonByName() {         
    Collections.sort(person, Person.nameComparator);         
    return person;     
  } 
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	

	public Person(String Name,String Email,long telephone) {
		this.name = Name;
		this.email = Email;
		this.telephone = telephone;
	}
	public static Comparator<Person> nameComparator = new Comparator<Person>() {         
	    @Override         
	    public int compare(Person jc1, Person jc2) {             
	      return (int) (jc1.getName().compareTo(jc2.getName()));         
	    }     
	  }; 
	  @Override     
	  public String toString() {         
	    return this.name + ", " + this.email + ", " + this.telephone;     
	  }

}
