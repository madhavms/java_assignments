package com.inapp.Firstjava.test;

public class PalinBuilderTest {
	public static void main(String[] args) {
		PalinBuilderTest palintest =new PalinBuilderTest();
		palintest.printResult();
	}
	public void printResult() {
		String s="MALAYALAM";
		System.out.println(s+" "+"is palindrome:"+isPalindrome(s));
	}
	public boolean isPalindrome(String s) {
		boolean isPal;
		StringBuilder buildName = new StringBuilder(s);
		buildName.reverse();
		isPal=s.equals(buildName.toString()); //StringBuilder and String not compatible
		return isPal;
		
	}
}

