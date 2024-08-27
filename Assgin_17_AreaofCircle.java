package Assignements;

import java.util.Scanner;

public class Assgin_17_AreaofCircle
{
	final static double pi = 3.14;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
        
        System.out.println("Enter the radius of the circle ");
        double radius = s1.nextDouble();
         double area = pi * radius * radius;
        System.out.println("The area of the circle  is: " + area);
       
        s1.close();

	}

}
