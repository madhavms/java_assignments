package com.inapp.Firstjava.learn;
import java.util.ArrayList;
import java.util.Comparator;

public class Person {
	
	private String name;
	private String email;
	private long telephone;
	static ArrayList<Person> arrayList = new ArrayList<Person>();
	
	
	public ArrayList<Person> getArrayList() {
		return arrayList;
	}

	public Person() {
		
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
