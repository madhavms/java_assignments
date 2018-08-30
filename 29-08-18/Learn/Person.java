package com.inapp.Firstjava.learn;

import java.util.Comparator;

public class Person {
	
	private String Name;
	private String Email;
	private long telephone;
	
	public Person() {
		
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
	    return " Name: " + this.Name + ", Email: " + this.Email + ", Telephone:" + this.telephone;     
	  }

}
