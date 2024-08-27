package Assignements;

import java.util.Scanner;

public class Assgin_22_circumference_Of_tringle 
{
	 public static void main(String[] args) 
	 {
	       
	        Scanner s1 = new Scanner(System.in);
	        System.out.println("Enter the a: ");
	        double a = s1.nextDouble();
	   	    System.out.println("Enter the b: ");
	        double b = s1.nextDouble();
	        System.out.println("Enter the c: ");
	        double c = s1.nextDouble();
	        double circumference = a + b + c;
	        System.out.println("The circumference of the triangle with sides " + a + ", " + b + "," + c + " is: " + circumference);
	        
	        // Close the scanner
	        s1.close();
	    }
	
}
