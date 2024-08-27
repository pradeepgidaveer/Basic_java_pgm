package Assignements;

public class Assgin_4_Method_overloading {

	static void AmzonLogin(String email)
	{
	
	System.out.println("My mailid");
	}
	static void AmzonLogin(long mob)
	{
	
		System.out.println("my mobile number");
	}
	void AmzonLogin()
	{
	
		System.out.println("welcome to user page");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Its my method overloding pgms");
		AmzonLogin("pradeep.gidaveer@gmail.com");
		AmzonLogin(98809880);
		
		Assgin_4_Method_overloading a1=new Assgin_4_Method_overloading();
		a1.AmzonLogin();
	}

}
