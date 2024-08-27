package Assignements;

import java.util.Scanner;

public class Assign_20_Area_Of_Rectangle 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        double l = s1.nextDouble();
        System.out.println("Enter the breadth of the rectangle: ");
        double b = s1.nextDouble();
        double area = l * b;
        System.out.println("The area of the rectangle with length " + l + " and breadth " + b + " is: " + area);
        s1.close();

	}

}
