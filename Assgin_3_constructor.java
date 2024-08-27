package Assignements;

public class Assgin_3_constructor 
{
	private String name;
	private int age; 
	public Assgin_3_constructor()
	{
		 name="ganesh";
		age=18;
		
		System.out.println("My constructor pgm");
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Assgin_3_constructor obj=new Assgin_3_constructor();
		System.out.println(obj.name);
		System.out.println(obj.age);
		
	}

}
