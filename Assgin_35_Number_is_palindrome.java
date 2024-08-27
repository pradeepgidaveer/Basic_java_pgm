package Assignements;

import java.util.Scanner;

public class Assgin_35_Number_is_palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int original = sc.nextInt();
        sc.close();

        int number = original;
        int reverse = 0;
        
        while (number != 0) 
        {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        
        if (original == reverse) 
        {
            System.out.println("The number " + original + " is a palindrome.");
        } else 
        {
            System.out.println("The number " + original + " is not a palindrome.");
        }
    }
}
