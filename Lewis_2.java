// NAME          : Shelby Alexander
// GROUP         : AP CS
// LAST MODIFIED : 16 September 2019
// PROBLEM ID    : 2.2 and 2.3
// DESCRIPTION   : This program takes in 3 floats
//                 and outputs the sum, product,
//                 difference, and average.
// SOURCES/HELP  : Mr. H, Lewis, Tingfeng Luo,
//                 Ben Miller, Alex Morrison

import java.util.Scanner;

public class Lewis_2
{
    public static void main(String[] args)
    {
        // signature
        System.out.println("Shelby Alexander\nAP CS\nLewis 2.2 and 2.3");
        
        // declare variables
        int numRuns;
        float num1, num2, num3;
        float sum, difference, product, average;
        Scanner scan = new Scanner(System.in);
        
        // asks user for number of runs
        System.out.print("\n\nPlease input the number of runs:  ");
        numRuns = scan.nextInt();
        
        // repeats program
        for(int j = 0; j < numRuns; j++)
        {  
            // asks the user for 3 numbers and inputs them
            System.out.print("\n\nPlease enter 3 numbers:  ");
            num1 = scan.nextFloat();
            num2 = scan.nextFloat();
            num3 = scan.nextFloat();
            
            // finds the sum, difference, product, and average
            // of the 3 given numbers
            sum = num1 + num2 + num3;
            difference = num1 - num2 - num3;
            product = num1 * num2 * num3;
            average = sum / 3;
            
            // outputs the sum, difference, product, and average
            System.out.println("\nThe sum is: " + sum + ".");
            System.out.println("The difference is: " + difference + ".");
            System.out.println("The product is: " + product + ".");
            System.out.println("The average is: " + average + ".");
        }
    }
}
