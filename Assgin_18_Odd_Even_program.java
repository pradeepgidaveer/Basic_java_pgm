package Assignements;

import java.util.Scanner;

public class Assgin_18_Odd_Even_program 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int num = s1.nextInt();

        if (num % 2 == 0) 
        {
            System.out.println(num + " is even");
        } else
        {
            System.out.println(num + " is odd");
        }
      
        s1.close();

	}

}
