/**
 * Gabriella Moreno
 * 9/9/25
 * Lab 3 - Compound Interest
 * 
 * 
 */

 // Import Scanner first to grt any usee input
 import java.util.Scanner;


 //next state the class, add header and open main

 public class Lab3_Gabriella_Moreno
 {

    public static void main(String[] args)
    {
        // Delcare Scanner so the input has somewhere to be stored
        Scanner input = new Scanner(System.in);

        //Declare all variables
        double InitialValue, InterestRate, FinalValue;
        int Years;

        // Ask user for initial value and assign it using Scanner
        System.out.print("Please enter homes initial value: ");
        InitialValue = input.nextDouble();

        // Ask for elasped amount of years
        System.out.print("Please enter the amount of elasped years: ");
        Years = input.nextInt();

        // Ask for interest rate
        System.out.print("Please enter the interest rate: ");
        InterestRate = input.nextDouble();

        // Convert the interest rate from a percentage to a decimal

        FinalValue = Math.pow((1 + InterestRate)) * InitialValue * Years;

        // Calculate the final value of house using formula for compound interest
        // A = P * (1 + r)^t
        // A = P * t, Math.pow(1 + r)


        // P = initial value
        // t = # of elasped years
        // r = interest rate(as a decimal)
        // A = final value




        System.out.print("The final value of the home is: " + FinalValue);



    }
 }