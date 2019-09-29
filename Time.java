// NAME          : Shelby Alexander
// GROUP         : AP CS
// LAST MODIFIED : 23 September 2019
// PROBLEM ID    : 2.6-2.7 Time
// DESCRIPTION   : This program takes in an
//				   amount of time and converts
//				   that amount into either seconds
//				   hours, minutes, and seconds.
// SOURCES/HELP  : Mr. H, Lewis, Tingfeng Luo,
//                 Ben Miller, Alex Blasen, Anna
//                 Buck, Alex Kish

import java.util.Scanner;
import java.lang.*;

public class Time
{
    public static void main(String[] args)
    {
        // signature
        System.out.println("Shelby Alexander\nAP CS\nLewis 2.6-2.7 Time");

        // declare variables
        boolean inputSecond;
        int numRuns, second, minute, hour, secTime;
        String inputTime;
        String[] timeTracker;
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        // asks user for number of runs
        System.out.print("\n\nHow many times do you want this program to run?  ");
        numRuns = scan.nextInt();

        // repeats program
        for(int j = 0; j < numRuns; j++)
        {
            // initializes a variable
            inputSecond = true;

            // prompts user for amount of time
            System.out.print("\n\nPlease input a certain amount of time:  ");
            inputTime = scan2.nextLine();

            // computes the amount of time
            for(int k = 0; k < inputTime.length(); k++)
            {
                if(inputTime.charAt(k) == ':')
                {
                    inputSecond = false;
                    break;
                }
            }

            // converts input and prints the answer
            if(inputSecond == true)
            {
                // converts input to hours, minutes, and seconds
                secTime = Integer.parseInt(inputTime);
                hour = secTime / 3600;
                secTime -= hour * 3600;
                minute = secTime / 60;
                secTime -= minute * 60;
                second = secTime;

                // prints the time in hours, minutes, and seconds
                System.out.print("\nThe amount of time is ");
                if(hour < 10)
                {
                    System.out.print("0" + hour + ":");
                }
                else
                {
                    System.out.print(hour + ":");
                }
                if(minute < 10)
                {
                    System.out.print("0" + minute + ":");
                }
                else
                {
                    System.out.print(minute + ":");
                }
                if(second < 10)
                {
                    System.out.print("0" + second + "\n");
                }
                else
                {
                    System.out.print(second + "\n");
                }
            }
            else
            {
                // converts input to an integer data type
                timeTracker = inputTime.split(":");
                hour = Integer.parseInt(timeTracker[0]);
                minute = Integer.parseInt(timeTracker[1]);
                second = Integer.parseInt(timeTracker[2]);

                // converts input to seconds
                second += hour * 3600 + minute * 60;

                // prints the time in seconds
                System.out.print("\nThe amount of time is " + second + ".\n");
            }
        }
        System.out.print("\n\n\n");
    }
}
