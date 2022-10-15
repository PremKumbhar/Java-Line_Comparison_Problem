package com.bridgelabz;

public class Line {
	Point point1 = new Point();
	Point point2 = new Point();
	
	public int getLengthOfLine() {
		int lineLength = (int) Math.sqrt(Math.pow((point2.getY() - point1.getY()), 2) + Math.pow((point2.getX() - point1.getX()), 2));
		return lineLength;
    }


	public void pointsInput() {
		System.out.println("Enter co-ordinates for point 1 : ");
		point1.getPoints();
		System.out.println("Enter co-ordinates for point 2 : ");
		point2.getPoints();
	}


	public static void compareByEquals(Line line1, Line line2) {
		Integer length1 = line1.getLengthOfLine();
		Integer length2 = line2.getLengthOfLine();
		if (length1.equals(length2)) {
		    System.out.println("Line 1 is equal to Line 2");
		} else {
		    System.out.println("Line 1 is not equal to Line 2");
		}
		
	}


	public static void compareByCompareTo(Line line1, Line line2) {
		Integer length1 = line1.getLengthOfLine();
		Integer length2 = line2.getLengthOfLine();
		if (length1.compareTo(length2) == 0) {
		    System.out.println("Line 1 is equal to Line 2");
		} else if (length1.compareTo(length2) == 1) {
		    System.out.println("Line 1 is greater than Line 2");
		} else {
		    System.out.println("Line 1 is less than Line 2");
		}
		
	}
}
