// NAME             :   Shelby Alexander
// GROUP            :   AP CS
// LAST MODIFIED    :   10 November 2019
// PROBLEM ID       :   Lewis 8.2 GCD
// DESCRIPTION      :	This program finds the
//                      greatest common divisor
//                      of two numbers.
// SOURCES/HELP     :   Mr. H, Lewis, Anna Buck

import java.util.Scanner;

public class DivisorCalc 
{
    // calculates the greatest common divisor
    public static int gcd(int num1, int num2)
    {
        if(num2 == 0){
            return num1;
        }
        return gcd(num2, num1%num2);
    }
    public static void main(String[] args)
    {
        // signature
        System.out.println("Shelby Alexander\nAP CS\nLewis 8.2 GCD");
        
        // declare variables
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("[\\()\\s\\,]+");
        int numRuns, num1, num2;
        
        // prompts user for the number of runs
        System.out.print("\n\nHow many times do you want this program to run?  ");
        numRuns = scan.nextInt();
        
        // repeats program
        for(int j = 0; j < numRuns; j++)
        {
            // prompts user for the two numbers
            System.out.print("\n\nPlease input two numbers:  ");
            num1 = scan.nextInt();
            num2 = scan.nextInt();
            
            // prints the greatest common divisor
            System.out.println("\n" + gcd(num1, num2));
        }
    }
}
