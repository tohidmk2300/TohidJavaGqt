/**
 * 
 */
package com.gqt.fstraining.strings;

/**
 * @author DELL
 *
 */
public class String3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("Rama");
		String s2=new String("rama");
		if (s1.equalsIgnoreCase(s2)==true) {
			System.out.println("Rferences are equal");
		}
		else {
			System.out.println("References are Not equal");
		}

	}

}
