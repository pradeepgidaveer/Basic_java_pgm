package Assignements;

import java.util.Arrays;
import java.util.Scanner;

public class Assgin_41_copy_Arrayto_Another_Array {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[]a=new int[4];
		int[]b=new int[4];
		System.out.println("Enter the value of Array1");
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		System.out.println("the value of Array1 is"+Arrays.toString(a));
		System.out.println("the value of Array2 bfr copy is"+Arrays.toString(b));
		//System.out.println("Enter the value of Array2");
		for(int i=0;i<a.length;i++) 
		{
			b[i]=a[i];
		}
		System.out.println("the value of Array2 aftr copy is"+Arrays.toString(b));


	}

}
