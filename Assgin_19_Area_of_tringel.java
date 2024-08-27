package Assignements;

import java.util.Scanner;

public class Assgin_19_Area_of_tringel 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the base of the triangle");
        double base = s1.nextDouble();
        System.out.println("Enter the height of the triangle");
        double height = s1.nextDouble();
        double area = (base * height) / 2;
        System.out.println("The area of the triangle with base :" + base + " and height: " + height + " is: " + area);
        s1.close();

	}

}
