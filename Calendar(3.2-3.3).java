// NAME          : Shelby Alexander
// GROUP         : AP CS
// LAST MODIFIED : 16 October 2019
// PROBLEM ID    : Lewis 3.2-3.3 Leap Year
// DESCRIPTION   : This program prompts for a
//                 year in the Gregorian calendar
//                 and determines if it is a 
//                 leap year.
// SOURCES/HELP  : Mr. H, Lewis

import java.util.Scanner;

public class leap_year 
{
    public static void main(String[] args)
    {
        // signature
        System.out.println("Shelby Alexander\nAP CS\nLewis 3.2-3.3 Leap Year");
        
        // declare variables
        int year;
        boolean run = true;
        String input;
        String leap = " is a leap year.";
        String notLeap = " is not a leap year.";
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        
        // repeats the program
        do
        {
            // prompts the user for a year
            System.out.print("\n\nPlease input a year:  ");
            year = scan.nextInt();
            
            // determines if the year is usable
            if(year >= 1582)
            {
                // determines if it is a leap year
                if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0)
                {
                    System.out.print("\n" + year + leap);
                }
                else
                {
                    System.out.print("\n" + year + notLeap);
                }
                
                // prompts user for another run
                System.out.print("\n\n\nWould you like to run this program again?  ");
                input = scan2.nextLine();

                // determines whether to run the program again
                if(input.equals("N"))
                {
                    run = false;
                }
            }
            else
            {
                System.out.println("\nThat year is not in the Gregorian calendar.");
            }
        }
        while(run == true);
    }
}
