/**
 * 
 */
package com.gqt.fstraining.arrays;
import java.util.Scanner;
/**
 * @author DELL
 *
 */
public class Array4D {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count of Universities:");
		int p=sc.nextInt();
		
		// Array creation
		int arr[][][][]=new int[p][][][];
		
		//Collecting college count
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter Total number of Colleges inside University:"+i);
			arr[i] = new int[sc.nextInt()][][];
		}
		
		//Collecting classroom count
		for(int i=0; i<arr.length;i++) {
			System.out.println("In College:"+i);
			for (int j=0;j<arr[i].length;j++) {
				System.out.println("Enter count of Classroom inside College:"+j);
				arr[i][j]=new int[sc.nextInt()][];
				
			}
		}
		for(int i=0; i<arr.length;i++) {
			System.out.println("In College:"+i);
			for (int j=0;j<arr[i].length;j++) {
				System.out.println("Inside the Classroom:"+j);
				for (int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter The count of Students inside Classroom:"+k);
					arr[i][j][k]=new int[sc.nextInt()];
				}
			}
		}
		
		//code to Collect marks
		for(int i=0;i<arr.length;i++) {
			System.out.println("University:"+i);
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("College:"+j);
				for (int k=0;k<arr[i][j].length;k++) {
					System.out.println("Classroom:"+k);
					for (int l=0;l<arr[i][j][k].length;l++) {
						System.out.println("Enter Marks of Student:"+(l+1));
						arr[i][j][k][l]=sc.nextInt();
					}
				}
			}
		}
		
		//Code To Display Marks
		for(int i=0;i<arr.length;i++) {
			System.out.println("University:"+i);
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("College:"+j);
				for (int k=0;k<arr[i][j].length;k++) {
					System.out.println("Classroom:"+k);
					for (int l=0;l<arr[i][j][k].length;l++) {
						System.out.println("Enter Marks of Student:"+arr[i][j][k][l]);
						
					}
				}
			}
		}

	}

}
