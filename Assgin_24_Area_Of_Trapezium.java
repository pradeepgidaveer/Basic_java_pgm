package Assignements;

import java.util.Scanner;

public class Assgin_24_Area_Of_Trapezium 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the a value: ");
        double a = s1.nextDouble();
   	    System.out.println("Enter the b value: ");
        double b = s1.nextDouble();
        System.out.println("Enter the h value: ");
        double h = s1.nextDouble();
        double trapizum = 0.5 * (a + b)*h;
        System.out.println("The area of trapizum is: " + trapizum);
        
        // Close the scanner
        s1.close();

	}

}
