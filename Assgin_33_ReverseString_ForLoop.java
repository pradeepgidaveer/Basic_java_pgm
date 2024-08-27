package Assignements;

import java.util.Scanner;

public class Assgin_33_ReverseString_ForLoop 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String a=sc.next();
		String reverse="";
		for( int i=a.length()-1;i>=0;i--)
		{
			reverse=reverse+a.charAt(i);
		}
		System.out.println("revesre of string "+a+" is "+reverse);
		

	}

	

}
