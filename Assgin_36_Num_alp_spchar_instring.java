package Assignements;

import java.util.Scanner;

public class Assgin_36_Num_alp_spchar_instring {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a string:");
	        String input = sc.nextLine();
	        sc.close();
	        
	        
	        int alphabetCount = 0;
	        int numberCount = 0;
	        int spaceCount = 0;
	        
	       
	        for (char ch : input.toCharArray()) 
	        {
	            if (Character.isLetter(ch)) 
	            {
	                alphabetCount++;
	            } else if (Character.isDigit(ch)) 
	            {
	                numberCount++;
	            } else if (Character.isWhitespace(ch)) 
	            {
	                spaceCount++;
	            }
	        }
	        
	       
	        System.out.println("Number of alphabets: " + alphabetCount);
	        System.out.println("Number of numbers: " + numberCount);
	        System.out.println("Number of spaces: " + spaceCount);
	    }
	}


