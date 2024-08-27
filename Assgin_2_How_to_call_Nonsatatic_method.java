package Assignements;

public class Assgin_2_How_to_call_Nonsatatic_method {
	void add()
	{
	int a=10;
	int b=20;
	int sum=a+b;
	System.out.println(sum);
	
	}
	void sub()
	{
	int a=25;
	int b=20;
	int subt=a-b;
	System.out.println(subt);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assgin_2_How_to_call_Nonsatatic_method a1=new Assgin_2_How_to_call_Nonsatatic_method();
		a1.add();
		a1.sub();

	}

}
