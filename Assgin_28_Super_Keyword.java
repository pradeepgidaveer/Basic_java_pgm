package Assignements;
class override1
{
	public void watsapp()
	{
		System.out.println("First verssion support text only");
	}
}
class override2 extends override1
{
	public void watsapp()
	{
		System.out.println("second verssion support text,emoji only");
		super.watsapp();
	}
}
class override3 extends override2
{
	public void watsapp()
	{
		System.out.println("third verssion support text,emoji,audio,video only");
		super.watsapp();
	}
}
public class Assgin_28_Super_Keyword extends override3
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Assgin_28_Super_Keyword s=new Assgin_28_Super_Keyword();
		s.watsapp();

	}

}
