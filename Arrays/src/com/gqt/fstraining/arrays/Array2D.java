/**
 * 
 */
package com.gqt.fstraining.arrays;
import java.util.Scanner;
/**
 * @author DELL
 *
 */
public class Array2D {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter The number of colleges");
		int m=sc.nextInt();
		System.out.println("Enter The numbe of Classroom");
		int n=sc.nextInt();
		int arr[][]= new int [m][n];
		
		System.out.println("number of the clg is 2");
		
		
		System.out.println("enter classroom present inside the each college");
		for(int i=0;i<arr.length;i++) {
			arr[i]=new int[sc.nextInt()];
			System.out.println(arr[1]);
		}
		
	}

}
