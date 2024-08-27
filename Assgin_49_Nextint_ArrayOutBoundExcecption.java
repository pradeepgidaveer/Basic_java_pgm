package Assignements;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assgin_49_Nextint_ArrayOutBoundExcecption 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//int [] a=new int[4];
		Scanner s =new Scanner(System.in);
		//System.out.println("the value of array");
		try
		{
			System.out.println("Enter number");
			
				int num=s.nextInt();
			
		}
		catch(InputMismatchException e) 
		{
			System.out.println("Enter only number");
			System.out.println("Enter the values in array");
		}
		int [] b=new int[4];
		Scanner s1 =new Scanner(System.in);
		try
		{
			for(int i=0;i<=b.length;i++)
			{
				b[i]=s1.nextInt();
			}
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Java.lang.ArrayIndexOutOfBoundsException handel successfuly");
		

		}
	}
	
}

