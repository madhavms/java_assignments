package com.inapp.Firstjava.test;

public class PalindromeTest {
	String S;
	public static void main(String[] args) {
		PalindromeTest pal =new PalindromeTest();
		pal.printResult();
		
	}
public void printResult() {
	
	S="MALAYALAM";
	System.out.println(S+" "+"is palindrome:"+isPalindrome(S));
}
public boolean isPalindrome(String s) {
	boolean isPal;
	
	String rev="";
	String[] result = s.split("");
    for(int i=0;i<result.length;i++) {
    	rev=result[i]+rev;
    	
    }
    
    isPal = s.equals(rev);
  
    return isPal;
}
}

