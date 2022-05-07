package com.gqt.fstraining.strings;

public class MethodsOfString {

	public static void main(String[] args) {
		String s1= "The Lion King";
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		//Boolean values True or False This startsWith method()
		System.out.println(s1.startsWith("The"));
		System.out.println(s1.startsWith("the"));
		
		System.out.println(s1.endsWith("King"));
		System.out.println(s1.endsWith("Kong"));
		
		System.out.println(s1.contains("Lion"));
		System.out.println(s1.contains("Sheep"));
		
		//returns string value after giving integer input
		System.out.println(s1.charAt(6));
		System.out.println(s1.length());
		
		// index number
		System.out.println(s1.indexOf("K"));
		 
		System.out.println(s1.concat("is Back"));
		
		System.out.println(s1.getClass());
		
		// checks our string has any data or not 
		System.out.println(s1.isBlank());
		System.out.println(s1.isEmpty());
		
		//lastInexOf method
		System.out.println(s1.lastIndexOf("i"));
		System.out.println(s1.lastIndexOf("on"));
		System.out.println(s1.lastIndexOf('i',6));
		
		System.out.println(s1.strip());
		System.out.println(s1.trim());
		System.out.println(s1.stripTrailing());
		System.out.println(s1.stripLeading());
		
		//array
		char[] c=s1.toCharArray();
		for (int i=0; i<s1.length();i++) {
		
		System.out.print(c[i]+",");
		}
		
		System.out.println(s1.toString());

	}

}
