package Assignements;
import java.util.Scanner;
public class Assgin_32_Switch_Case 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int a =sc.nextInt();
		switch(a)
		{
		case 1:
		{
			System.out.println("Weake up early");
			break;
		}
		case 2:
		{
			System.out.println("Have lunch afternoon");
			break;
		}
		case 3:
		{
			System.out.println("good evng");
			break;
		}
		default :
		{
			System.out.println("good bye");
		}
		sc.close();
		}

	}

}
