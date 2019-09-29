// NAME             : Shelby Alexander
// GROUP            : AP CS
// LAST MODIFIED    : 25 September 2019
// PROBLEM ID       : 2.8 Distance
// DESCRIPTION      : This program takes in two
//                    coordinates on the Cartesian
//                    plane and finds the distance
//                    between them.
// SOURCES/HELP     : Mr. H, Lewis, Tingfeng Luo,
//                    Ben Miller, Alex Blasen,
//                    Anna Buck

import java.lang.*;
import java.util.*;
import java.io.*;

public class Distance
{
    public static void main(String[] args)
    {
        // signature
        System.out.println("Shelby Alexander\nAP CS\nLewis 2.8 Distance");

        // declare variables
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        scan2.useDelimiter("[\\()\\s\\,]+");
        int numRuns;
        double x1, x2, y1, y2, distance;

        // prompts user for the number of runs
        System.out.print("\n\nHow many times do you want this program to run?  ");
        numRuns = scan.nextInt();

        // repeats program
        for(int j = 0; j < numRuns; j++)
        {
            // prompts user for the two points
            System.out.print("\n\nPlease input two points in the Cartesian plane:  ");
            x1 = scan2.nextDouble();
            y1 = scan2.nextDouble();
            x2 = scan2.nextDouble();
            y2 = scan2.nextDouble();

            // calculates the distance
            distance = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));

            // prints the distance between the given coordinates
            System.out.printf("\nThe distance is:  %.3f", distance);
            System.out.print("\n");
        }
    }
}
