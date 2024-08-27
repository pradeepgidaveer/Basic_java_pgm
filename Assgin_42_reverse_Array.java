package Assignements;

import java.util.Arrays;

public class Assgin_42_reverse_Array {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int old_array[]=new int[3];
		int reverse_array[]=new int[3];
		
		old_array[0]=10;
		old_array[1]=20;
		old_array[2]=30;
		
		for(int i=0,k=reverse_array.length-1;i<old_array.length;i++)
		{
			reverse_array[k]=old_array[i];
			k--;
		}
		System.out.println("the value of Array1 is"+Arrays.toString(old_array));
		System.out.println("the value of Array1 is"+Arrays.toString(reverse_array));
		

	}

}
