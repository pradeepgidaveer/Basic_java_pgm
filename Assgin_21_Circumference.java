package Assignements;

import java.util.Scanner;

public class Assgin_21_Circumference 
{
	final static double pi = 3.14;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
        
        System.out.println("Enter the radius of the circle ");
        double r = s1.nextDouble();
         double circumference = 2*pi * r;
        System.out.println("The circumference of the circle with radius: " + circumference);
       
        s1.close();

	}

}
