package Assignements;
import java.util.Scanner;
import java.util.Arrays;
public class Assgin_39_Array_of_double_data 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double[]a=new double[4];
		
		System.out.println("Enter the value of Array");
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextDouble();
		}
		System.out.println("Enter the value of Array"+Arrays.toString(a));
		

	}

	}


