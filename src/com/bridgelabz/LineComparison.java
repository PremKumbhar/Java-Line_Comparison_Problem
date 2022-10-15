package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
	 public static void main(String[] args) {
	    	
	    	Line line1 = new Line();
	    	System.out.println("Enter the points for line 1 : ");
	    	line1.pointsInput();
	    	Line line2 = new Line();
	     	System.out.println("Enter the points for line 2 : ");
	    	line2.pointsInput();
	    
	    	Line.compareByEquals(line1, line2);
	    	Line.compareByCompareTo(line1, line2);
	    	
	    }
}
