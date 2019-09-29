// NAME          : Shelby Alexander
// GROUP         : AP CS
// LAST MODIFIED : 22 September 2019
// PROBLEM ID    : 2.10 Heron's Formula
// DESCRIPTION   : This program takes in the lengths
//                 for 3 sides of a triangle and
//                 finds the area of that triangle
//                 using Heron's Formula.
// SOURCES/HELP  : Mr. H, Lewis, Tingfeng Luo,
//                 Ben Miller, Alex Blasen

import java.util.Scanner;
import java.lang.Math;

public class Herons_Formula
{
    public static void main(String[] args)
    {
        // signature
        System.out.println("Shelby Alexander\nAP CS\nLewis 2.10 Heron's Formula");
        
        // declare variables
        int numRuns;
        double a, b, c;
        double s, area;
        Scanner scan = new Scanner(System.in);
        
        // asks user for number of runs
        System.out.print("\n\nHow many times do you want this program to run?  ");
        numRuns = scan.nextInt();
        
        // repeats program
        for(int j = 0; j < numRuns; j++)
        {  
            // asks the user for 3 numbers and inputs them
            System.out.print("\n\nPlease enter 3 numbers:  ");
            a = scan.nextDouble();
            b = scan.nextDouble();
            c = scan.nextDouble();
            
            // finds the area of the triangle
            s = (a + b + c) * 0.5;
            area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            
            // outputs the area of the triangle
            System.out.printf("\nThe area is: %.3f", area);
        }
    }
}
