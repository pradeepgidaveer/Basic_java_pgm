package Assignements;

import java.util.Scanner;

public class Assgin_37_Specila_Char_count 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        sc.close();
       
        int spaceCount = 0;
        
       
        for (char ch : input.toCharArray()) 
        {
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                spaceCount++;
            }

            
        }
        
   
        //System.out.println("Number of alphabets: " + alphabetCount);
        //System.out.println("Number of numbers: " + numberCount);
        System.out.println("Number of spaces: " + spaceCount);
    }


	}


