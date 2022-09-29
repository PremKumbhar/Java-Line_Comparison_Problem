package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
	public static int getLengthOfLine(Scanner scanner)
	 {
        System.out.println("Please enter x1");
        int x1 = scanner.nextInt();

        System.out.println("Please enter y1");
        int y1 = scanner.nextInt();

        System.out.println("Please enter x2");
        int x2 = scanner.nextInt();

        System.out.println("Please enter y2");
        int y2 = scanner.nextInt();

        int val1 = (int) Math.pow((x2 - x1), 2);
        int val2 = (int) Math.pow((y2 - y1), 2);
        int result = (int) Math.sqrt(val1 + val2);

        return result;
     }


public static void main(String[] args)

        {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter values for line 1");
        int lenthOfline_1 = getLengthOfLine(scanner);
        System.out.println("Please enter values for line 2");
        int lenthOfline_2 = getLengthOfLine(scanner);
       
        String val1=String.valueOf(lenthOfline_1);
        String val2=String.valueOf(lenthOfline_2);
       
        if(val1.equals(val2)){
                System.out.println("Both lines are equal");
        }
        else 
        {
                System.out.println("Both lines are not equal");
        }
        scanner.close();        
}
}
