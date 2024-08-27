package Assignements;

import java.util.Date;

public class Assign_59_Current_DateAndTime 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Date d1=new Date();
		System.out.println(d1.getTime());
		Date d2=new Date(d1.getTime());
		String time=d2.toString();
		
		String month =time.substring(4,7);
		System.out.println(month);
		String date =time.substring(8,10);
		System.out.println(date);
		String year =time.substring(time.length()-4);
		System.out.println(year);
		
		String Dateformat1=date.concat(month).concat(year);
		System.out.println(Dateformat1);
		String Dateformat2=date.concat("-").concat(month).concat("-").concat(year);
		System.out.println(Dateformat2);
		
		
		

	}

}
