package Assignements;
import java.util.Scanner;
import java.util.Arrays;

public class Assgin_38_2_arrays_equal_each 
{

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
		System.out.println("Enter the value of Array2");
		for(int i=0;i<a.length;i++) 
		{
			b[i]=sc.nextInt();
		}
		if(Arrays.equals(a, b))
		{
			System.out.println("both Array1 and Array2 are equal ");
		}
		else
		{
			System.out.println("both Array1 and Array2 are not equal ");
		}

	}

}
