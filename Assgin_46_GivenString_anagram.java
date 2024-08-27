package Assignements;

import java.util.Arrays;
import java.util.Scanner;

public class Assgin_46_GivenString_anagram 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enrtr stringl");
		String a=sc.next();
		String first=a;
		System.out.println("enrtr string2");
		String b=sc.next();
		String second=b;
		if(a.length()!=b.length())
		{
			System.out.println("not anagram");
		}
		else
		{
			char[]c=a.toCharArray();
			char[]c1=b.toCharArray();
			Arrays.sort(c);
			Arrays.sort(c1);
			boolean ans=Arrays.equals(c, c1);
			if(ans==true)
			{
				System.out.println("strings are anagram");
			}
			else
			{
				System.out.println("strings are not anagram");
			}
			
		}
		

	}

}
