package Assignements;

public class Assgin_15_Female_Male_travel {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		  String gender = "Male"; 
	        int age = 60;  

	        if (gender=="Female")
	        {
	           System.out.println("Travel is free for females");
	        } 
	        else if (gender=="Male") 
	        {
	            
	            if (age <= 12) 
	            {
	               System.out.println("Half ticket for males aged 12 or below.");
	            } 
	            else if (age > 12 && age <= 59) 
	            {
	                System.out.println("Full ticket for males aged between 13 and 59.");
	            } 
	            else if (age >=13 && age > 59) 
	            {
	                System.out.println("Senior citizen ticket for males aged 60 or above.");
	            } 
	            
	        } 
	        
	    }

	}


