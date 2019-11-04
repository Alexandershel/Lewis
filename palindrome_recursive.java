// NAME            : Shelby Alexander
// GROUP           : AP CS
// LAST MODIFIED   : 23 October 2019
// PROBLEM ID      : Lewis 8.1 Recursive Palindrome Tester
// DESCRIPTION     : This program prompts the user
//                   for a string and determines if
//                   that string is a palindrome
//                   recursively.
// SOURCES/HELP    : Lewis, Mr. Houtrouw, Anna Buck

import java.util.Scanner;

public class Palindrome_Recursive 
{
    public static boolean isPalindrome(String s)
    {   
        // determines if the string is a palindrome
        if(s.length() == 0 || s.length() == 1)
        {
            return true; 
        }
        if(s.charAt(0) == s.charAt(s.length()-1))
        {
            return isPalindrome(s.substring(1, s.length()-1));
        }
        else
        {
            return false;
        }
    }
    public static void main(String[]args)    
    {
        // signature
        System.out.println("Shelby Alexander\nAP CS\nLewis 3.11 Palindrome Tester");

        // declare variables
        String str, another = "y";
        Scanner scan = new Scanner(System.in);
        
        // repeats program
    	while (another.equalsIgnoreCase("y"))
        {
            // inputs the string and simplifies it
            System.out.print("\n\nEnter a potential palindrome:  ");
            str = scan.nextLine();
            str = str.toLowerCase();
            str = str.replaceAll("[.'?!\\s]","");
            
            // prints the answer
            if(isPalindrome(str))
            {
                System.out.println("\nThat string IS a palindrome.");
            }
            else
            {
                System.out.println("\nThat string is NOT a palindrome.");
            }
            
            // prompts the user for another run
            System.out.print("\n\nTest another palindrome (y/n)? ");
            another = scan.nextLine(); 
        }
    }
}
