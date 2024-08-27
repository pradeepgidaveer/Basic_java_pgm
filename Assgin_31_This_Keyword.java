package Assignements;

public class Assgin_31_This_Keyword 
{
int age=10;
String car="Benz";
double milage=98.544;
int price=5000;
public void clash(int age,String car,double milage,int price)
{
	this.age=age;
	this.car=car;
	this.milage=milage;
	this.price=price;
	System.out.println("Welcome 2 car world");
}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Assgin_31_This_Keyword t= new Assgin_31_This_Keyword();
		t.clash(5, "Maruti", 23.678, 7874);
		System.out.println(t.age);
		System.out.println(t.car);
		System.out.println(t.milage);

	}

}
