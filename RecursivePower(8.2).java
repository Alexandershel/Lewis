// NAME          : Shelby Alexander
// GROUP         : AP CS
// LAST MODIFIED : 16 October 2019
// PROBLEM ID    : Lewis 8.2 (Short) Recursive Power
// DESCRIPTION   : This program recursively solves an
//				   exponential function.
// SOURCES/HELP  : Mr. H, Lewis, Aiden Eichman,
//                 Kayla O'Donnell, Anna Buck

import java.util.Scanner;

public class recursive_power 
{
    public static int method(int x, int y)
    {
        if(y == 0)
        {
            return 1;
        }
        else
        {
            return x*(method(x, y-1));
        }
    }
        
    public static void main(String[] args)
    {   
        // signature
        System.out.println("Shelby Alexander\nAP CS\nLewis 8.2 (Short) Recursive Power");
        
        // declare variables
        Scanner scan = new Scanner(System.in);
        int x, y, numRuns;
        
        // prompts user for the number of runs
        System.out.print("\n\nPlease input the desired number of runs:  ");
        numRuns = scan.nextInt();
        
        // repeats program
        for(int j = 0; j < numRuns; j++)
        {
            // prompts user for the exponential function
            System.out.print("\n\nPlease input a base and an exponent to solve:  ");
            x = scan.nextInt();
            y = scan.nextInt();
            
           // prints the answer
           System.out.print("\n" + method(x, y));
        }
    }
}
