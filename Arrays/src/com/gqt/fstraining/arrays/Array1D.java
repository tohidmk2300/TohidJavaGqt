/**
 * 
 */
package com.gqt.fstraining.arrays;
import java.util.Scanner;
/**
 * @author DELL
 *
 */
public class Array1D {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The number of colleges");
		int m=sc.nextInt();//3
		
		System.out.println("Enter The numbe of Classroom");
		int n=sc.nextInt();
		System.out.println("Enter The number of students inside classroom in that college");
		int o= sc.nextInt();
		
		int arr[][][]= new int [m][n][o];
		
		System.out.println("The Array is ready for the operation");
		System.out.println("The length of the outer portion of the array is:"+arr.length);
		System.out.println("               ");
		// Code to store marks of o students inside n classrooms in m college
		for (int i=0;i<arr.length;i++) {
			System.out.println("The count of classrooms in the College :"+(i+1));
			for (int j=0;j<arr[i].length;j++) {
				System.out.println("The count of students inside the Classroom:"+(j+1));
				for (int k=0;k<arr[j].length;k++) {
					System.out.println("Enter The marks of the Student "+(k+1));
					arr[i][j][k]=sc.nextInt();
				}
			}
		}
		
		// Code to display marks
		for (int i=0;i<arr.length;i++) {
			System.out.println("In College "+(i+1));
			for (int j=0;j<arr[i].length;j++) {
				System.out.println("Inside the Class:"+(j+1));
				for (int k=0;k<arr[j].length;k++) {
					System.out.println("The marks of the student "+(k+1)+" is:"+arr[i][j][k]);
				}	
			}
		}	
			
	}

}
