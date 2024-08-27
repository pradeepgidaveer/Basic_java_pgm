package Assignements;

class person
{
	private int age=25;
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	
}
public class Assgin_58_Encapsulation_using_int_data 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		person p=new person();
		p.setAge(28);
		System.out.println(p.getAge());

	}

}
