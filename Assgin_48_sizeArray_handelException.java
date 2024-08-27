package Assignements;

import java.util.Scanner;

public class Assgin_48_sizeArray_handelException 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int [] a=new int[4];
		Scanner s =new Scanner(System.in);
		System.out.println("the value of array");
		try
		{
			for(int i=0;i<=a.length;i++)
			{
				a[i]=s.nextInt();
			}
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Java.lang.ArrayIndexOutOfBoundsException handel successfuly");
		}
		

	}

}
