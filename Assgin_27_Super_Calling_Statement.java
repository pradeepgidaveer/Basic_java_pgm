package Assignements;
class mestho
{
	public mestho( boolean a)
	{
		System.out.println("1");
	}
}
class tulso extends mestho
{
	public tulso(String p)
	{
		super(true);
		System.out.println("2");
	}
}
class miaski extends tulso
{
	public miaski(int a ,float b)
	{
		super("hi");
		System.out.println("3");
	}
}
class Europe extends tulso
{
	public Europe(int a )
	{
		super("20,45.80f");
		System.out.println("4");
	}
}
public class Assgin_27_Super_Calling_Statement extends Europe
{
	public Assgin_27_Super_Calling_Statement() 
	{
		super(15);
		
	
		System.out.println("5");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		new Assgin_27_Super_Calling_Statement();

	}

}
