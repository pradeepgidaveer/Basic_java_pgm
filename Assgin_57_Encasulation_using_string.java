package Assignements;

class Amazon_prog
{
	private String username="Encapsul";
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username)
	{
		this.username=username;
	}
	
}
public class Assgin_57_Encasulation_using_string 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Amazon_prog a =new Amazon_prog();
		a.setUsername("Encapsulation Program");
		System.out.println(a.getUsername());

	}

}
