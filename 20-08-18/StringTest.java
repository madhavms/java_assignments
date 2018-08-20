package com.inapp.Firstjava.test;

public class StringTest {
public static void main(String[] args) {
	char[] helloArray = {'h','e','l','l','o',','};
	String helloString = new String(helloArray);
	System.out.println(helloString);
	int length = helloString.length();
	System.out.println("Length of string is:"+length);
	String world = "world";
	System.out.println(helloString.concat(world));
	System.out.println(world.hashCode()); //prints hashcode for string
	
}
}

