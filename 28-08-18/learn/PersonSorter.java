package com.inapp.Firstjava.learn;

import java.util.ArrayList; 
import java.util.Collections;                  
public class PersonSorter {     
  ArrayList<Person> person = new ArrayList<>();       
      
  public PersonSorter(ArrayList<Person> person) {         
	    this.person = person;     
	  } 
  
  public ArrayList<Person> getSortedPersonByName() {         
    Collections.sort(person, Person.nameComparator);         
    return person;     
  } 
}
