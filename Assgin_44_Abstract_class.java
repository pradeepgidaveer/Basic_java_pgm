package Assignements;
abstract class property{
	abstract void salary();
	void house()
	{
		System.out.println("parents have ahouse");
	}
	abstract void gold();
	void car()
	{
		System.out.println("parents have car");
	}

}

public class Assgin_44_Abstract_class extends property
{
	void salary()
	{
		System.out.println("having salary=Rs60.000");
	}

	void gold()
	{
		System.out.println("having gold=kg 60.000");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Assgin_44_Abstract_class a = new Assgin_44_Abstract_class();
		a.car();
		a.gold();
		a.salary();
		
	}

}
