package Assignements;

import java.util.Arrays;
import java.util.Scanner;

public class Assign_43_Array_dataType_size_is_4 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[]a=new int[4];
		int sum=0;
		System.out.println("Enter the value of Array");
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		
		//System.out.println("Enter the value of Array2");
		for(int i=0;i<a.length;i++) 
		{
			sum=sum+a[i];
		}
		int avg=sum/4;
		System.out.println("the value of Array are"+Arrays.toString(a));
		System.out.println("the avg of Array are"+avg);

	}

}
