package Assignements;

public class Assgin_29_Calling_Statement 
{
	
		public  Assgin_29_Calling_Statement()
		{
			this(5.85f);
			System.out.println("i am with zero parameter");
		}
		public Assgin_29_Calling_Statement( int a)
		{
			this();
			System.out.println("i am integer data type");
		}
		public Assgin_29_Calling_Statement( float a)
		{
			this("Hi");
			System.out.println("i am flot");
		}
		public Assgin_29_Calling_Statement( String a)
		{
			//this("Hi");
			System.out.println("String data type");
		}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		new Assgin_29_Calling_Statement(2);

	}

}
