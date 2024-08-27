package Assignements;

public class Assign_8_finalvariable {

	 final int ObtainedMarks=130;
	 private String name="ganesh";
	private int age=20; 
	
	public Assign_8_finalvariable()
	{
		 name="ganesh achyara";
		age=25;
		//ObtainedMarks=150;
		
		System.out.println("My finalvariable pgm");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Assign_8_finalvariable obj=new Assign_8_finalvariable();
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.ObtainedMarks);
	}

}
