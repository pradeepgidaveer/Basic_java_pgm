package Assignements;
import java.util.Scanner;
public class Assgin_16_Airthmatic_opertation {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner n1=new Scanner(System.in);
		System.out.print("Enter the a value ");
		int a=n1.nextInt();
		System.out.print("Enter the b value ");
		int b=n1.nextInt();
		int sum=a+b;
		int sub=a-b;
		int mul=a*b;
		int div=a/b;
		int mod=a%b;
		System.out.println("sum "+sum);
		System.out.println("sub "+sub);
		System.out.println("mul "+mul);
		System.out.println("div "+div);
		System.out.println("mod "+mod);
		//System.out.print("sum "+sum);
		n1.close();

	}

}

