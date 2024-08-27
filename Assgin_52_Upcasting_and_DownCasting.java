package Assignements;


	class parent1
	{
		
		public void farmhouse()
		{
			System.out.println("Grand parent farm house");
		}
		public void land()
		{
			System.out.println("Grand parent land");
		}
		public static void complex()
		{
			System.out.println("Grand parent complex");
		}
		public static void home()
		{
			System.out.println("Grand parent home");
		}
	}
	public class Assgin_52_Upcasting_and_DownCasting extends parent1
	{
		
		public void Parent_farmhouse()
		{
			System.out.println(" parent farm house");
		}
		public void pent_house()
		{
			System.out.println(" parent pent house");
		}
		public static void car()
		{
			System.out.println(" parent has car");
		}
		public static void golds()
		{
			System.out.println(" parent has golds");
		}
	

	
		
		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			System.out.println("Upcasting");
			parent1 sp =new Assgin_52_Upcasting_and_DownCasting();
			sp.land();
			sp.home();
			System.out.println("");
			System.out.println("Downcasting");
			
			Assgin_52_Upcasting_and_DownCasting s= (Assgin_52_Upcasting_and_DownCasting) sp;
			home();
			s.golds();
			s.pent_house();
			
			}
		}
	
	
	
	
	

