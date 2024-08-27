package Assignements;

public class Assgin_5_Constructor_overloading {
	private String name;
	private int age; 
	private long mob;
	private int rollnumber;
	public Assgin_5_Constructor_overloading()
	{
		 name="ganesh";
		age=18;
		
		System.out.println("My constructor overloading pgm");
	}
	public Assgin_5_Constructor_overloading(long m,int r)
	{
		mob=m;
		rollnumber=r;
		
		System.out.println("My constructor overloading with argument pgm");
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Assgin_5_Constructor_overloading obj=new Assgin_5_Constructor_overloading();
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		Assgin_5_Constructor_overloading obj1=new Assgin_5_Constructor_overloading(9999999,25);
		System.out.println(obj1.mob);
		System.out.println(obj1.rollnumber);
		
		
	}

}
