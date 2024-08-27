package Assignements;
class supermost_parent
{
	public static String a="10 acr land";
	public void farmhouse()
	{
		System.out.println("Grand parent farm house");
	}
}
class parent extends supermost_parent
{
	
	public void Parent_farmhouse()
	{
		System.out.println(" parent farm house");
	}
	public void pent_house()
	{
		System.out.println(" parent pent house");
	}
	public void car()
	{
		System.out.println(" parent has car");
	}
}

public class Assgin_26_Multilevel_Inheritance extends parent
{
	public void son()
	{
		System.out.println(" Son extend all properties of garand and parents");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Assgin_26_Multilevel_Inheritance s=new Assgin_26_Multilevel_Inheritance();
		System.out.println(a);
		s.farmhouse();
		
		s.Parent_farmhouse();
		s.pent_house();
		s.car();
		s.son();

	}

}
