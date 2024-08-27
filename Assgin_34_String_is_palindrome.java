package Assignements;

import java.util.Scanner;

public class Assgin_34_String_is_palindrome {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String a=sc.next();
		String reverse="";
		String original=a;
		for( int i=a.length()-1;i>=0;i--)
		{
			reverse=reverse+a.charAt(i);
		}
		if(reverse.equals(original))
		{
			System.out.println("revesre of string "+a+" is palindrome");
		}
		else
		{
			
			System.out.println("revesre of string "+a+" is not palindrome");
		}
		

	}

}
