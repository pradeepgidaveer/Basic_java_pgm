package Assignements;

import java.util.Arrays;

public class Assgin_40_GiveNumber_Partof_Array 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] a =new int[4];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		int givennum=100;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
		if(givennum==a[i])
		{
			count++;
		}
		}
		if(count==1) 
		
		{
			System.out.println("Given array in the list");
		}
		else
		{
			System.out.println("Given array not in the list");
		}
		

	}

}
