package Assignements;

public class Assgin_50_StringOutBoundException 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String a="pradeep";
		try
		{
			System.out.println(a.charAt(9));
		}
		catch(StringIndexOutOfBoundsException e) 
		{
			System.out.println("Java.lang.StringIndexOutOfBoundsException handel successfuly");
		

		}

	}

}
