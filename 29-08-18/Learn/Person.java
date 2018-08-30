package com.inapp.Firstjava.learn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Person {
	
	private String Name;
	private String Email;
	private long telephone;
	static ArrayList<Person> arrayList = new ArrayList<Person>();
	ArrayList<Person> person = new ArrayList<>();
	
	public Person() {
		
	}
	
	public static void createPerson(String Name,String Email,long Telephone) {
		
		arrayList.add(new Person(Name,Email,Telephone));
		
	}    
	public void getPersonByName() throws IOException {
		System.out.println("Enter the Name: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String S = reader.readLine();
		boolean x = false;
		for(Person name:arrayList) {
			
			if(name.getName().toLowerCase().equals(S.toLowerCase())) {
				System.out.println(name);
				x = true;
			}
		}
		if(x == false) {
			System.out.println(S+" is not found");
		}
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
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public long getTelephone() {
		return telephone;
	}

	public void setTelephone(long telephone) {
		this.telephone = telephone;
	}

	

	public Person(String Name,String Email,long telephone) {
		this.Name = Name;
		this.Email = Email;
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
	    return "Name: " + this.Name + ", Email: " + this.Email + ", Telephone:" + this.telephone;     
	  }

}
