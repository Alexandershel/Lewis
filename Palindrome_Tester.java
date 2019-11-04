// NAME            : Shelby Alexander
// GROUP           : AP CS
// LAST MODIFIED   : 20 October 2019
// PROBLEM ID      : Lewis 3.11 Palindrome Tester
// DECRIPTION      : This program prompts the user
//                   for a string and determines if
//                   that string is a palindrome.
// SOURCES/HELP    : Lewis, Mr. Houtrouw, Anna Buck

import java.util.Scanner;

public class Palindrome_Tester
{
    public static void main(String[] args)
    {
        // signature
        System.out.println("Shelby Alexander\nAP CS\nLewis 3.11 Palindrome Tester");

        // declare variables
        String str, another = "y";
        int left, right;
        Scanner scan = new Scanner(System.in);

        while (another.equalsIgnoreCase("y")) // allows y or Y
        {
            System.out.print("\n\nEnter a potential palindrome:  ");
            str = scan.nextLine();
            str = str.toLowerCase();
            str = str.replaceAll("[.'?!\\s]","");

            left = 0;
            right = str.length() - 1;

            while (str.charAt(left) == str.charAt(right) && left < right)
            {
                left++;
                right--;
            }

            if(left < right)
            {
                System.out.println("\nThat string is NOT a palindrome.");
            }
            else
            {
                System.out.println("\nThat string IS a palindrome.");
            }
            System.out.print("\n\nTest another palindrome (y/n)? ");
            another = scan.nextLine();
        }
    }
}
