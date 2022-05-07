package com.gqt.fstraining.strings;

import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner sc=new Scanner(System.in);
		String x= sc.next();
	    String y="";
	    
	    for (int i=x.length()-1;i>=0;i--) {
	    	y=y+x.charAt(i);
	    }
		System.out.println(y);
		if (y.equals(x)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
