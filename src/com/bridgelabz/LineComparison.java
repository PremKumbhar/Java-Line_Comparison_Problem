package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
	public static int getLengthOfLine(Scanner scan) {
		// User Input
		  System.out.println("enter x1 point");
	      int x1=scan.nextInt();
	      
	      System.out.println("enter y1 point");
	      int y1=scan.nextInt();
	      
	      System.out.println("enter x2 point");
	      int x2=scan.nextInt();
	      
	      System.out.println("enter y2 point");
	      int y2=scan.nextInt();
		
	      int val1 = (int) Math.pow((x2 - x1), 2);
	      int val2 = (int) Math.pow((y2 - y1), 2);
	      int result = (int) Math.sqrt(val1 + val2);
	      return result;
	}
	public void greatersmaller() 
	{
		// User Input
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter value for line 1");
		int lengthOfLine_1 = getLengthOfLine(scan);
		System.out.println("Please enter value for line 2");
		int lengthOfLine_2 = getLengthOfLine(scan);
		
		Integer val1 = lengthOfLine_1;
		Integer val2 = lengthOfLine_2;
		
		System.out.println("*********************************************");
		// To check greater than or less than
		//if (val1 == val2) {
		if(val1.compareTo(val2) == 0) {
			System.out.println("Both lines are equal");
		} //else if (val1 < val2) {
		else if(val1.compareTo(val2) == -1) {
			System.out.println("Lines 2 is greater");
		} else {
			System.out.println("Lines 1 is greater");
		}
		scan.close();
		
	}
	public static void main(String[] args) 
	{
		 System.out.println("Welcome to Line Comparison Program");
		 
		 // Creating an object
		 LineComparison x = new LineComparison();
		 // Calling methode
		 x.greatersmaller(); 
	 }
}
