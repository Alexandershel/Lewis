// NAME             : Shelby Alexander
// GROUP            : AP CS
// LAST MODIFIED    : 26 September 2019
// PROBLEM ID       : 2.13 Random
// DESCRIPTION      : This program outputs randomized
//                    phone numbers.
// SOURCES/HELP     : Mr. H, Lewis

import java.lang.*;
import java.util.*;
import java.io.*;
import java.text.*;

public class RandomShelby
{
    public static void main(String[] args)
    {
        // signature
        System.out.println("Shelby Alexander\nAP CS\nLewis 2.13 Random");

        // declare variables
        Scanner scan = new Scanner(System.in);
        Random number = new Random();
        int numPrint, prefix, line;
        DecimalFormat three = new DecimalFormat("###");
        DecimalFormat four = new DecimalFormat("####");

        // prompts user for the number of outputs
        System.out.print("\n\nHow many random phone numbers do you want to see?  ");
        numPrint = scan.nextInt();

        // repeats program
        for(int j = 0; j < numPrint; j++)
        {
            // generates the area code
            int num1 = number.nextInt(8);
            int num2 = number.nextInt(8);
            int num3 = number.nextInt(8);
            String area = Integer.toString(num1) + Integer.toString(num2);
            area += Integer.toString(num3);

            // generates the prefix and line numbers
            prefix = number.nextInt(743);
            line = number.nextInt(10000);

            // prints the phone number
            System.out.print("\n");
            System.out.print(area + "-" + three.format(prefix) + "-" + four.format(line));
        }

        // formats terminal
        System.out.print("\n");
    }
}
