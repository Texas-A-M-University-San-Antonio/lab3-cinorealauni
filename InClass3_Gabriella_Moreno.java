/**
 * Name: Gabriella Moreno
 * Date: 9/9/25
* Purpose: InClass 3 - 
* Calculating cubed using Math.pow().
 */


// Don't forget to import and declare a Scanner for user input.
import java.util.Scanner;

public class InClass3_Gabriella_Moreno
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in); // Declaring scanner to store input by user.
        
        // In-Class 3 Example:

        // Three major steps: Input - Processing - Output
        // Declare three variables to used in program

        double side, volume, surfaceArea;
        // Step 1: Prompt the user to enter the length of the side of a cube.
        System.out.print("Enter the length of the cube's side: ");

        // Step 2: Read the user's input and store it in a variable.
        side = input.nextDouble(); // side is INPUT by th user

        // trick for later.. what if i was using an int variable type, and inputing

        // Step 3: Use an appropriate method to determine the volume of the cube.
        volume = Math.pow(side, 3);

        // Step 4: Use an appropriate method to determine the surface area of the cube.
        surfaceArea = 6 * Math.pow(side, 2);

        // HINT: Steps 3 and 4 will use the Math.pow(a, b) method

        // Step 5: Print the volume and surface area in clear sentences.
        System.out.println("The volume of the cube is: " + volume);

        System.out.println("The surface area of the cube is: " + surfaceArea);
    }
}