package Assignements;

import java.util.Scanner;

public class Assgin_23_circumference_Of_rectangle 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the a value: ");
        double a = s1.nextDouble();
   	    System.out.println("Enter the b value: ");
        double b = s1.nextDouble();
        double circumference = 2 * (a + b);
        System.out.println("The circumference of the rectangle is: " + circumference);
        
        // Close the scanner
        s1.close();

	}

}
