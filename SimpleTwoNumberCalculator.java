// This program calculates does arithmetic operations on two numbers

/*
1. Ask user for two numbers
2. Ask user for arithmetic operation of choice
3. Check the arithmetic operation through a condition
4. Display result
5. Ask user to continue or exit
6. If the user continues, loop back to step 1
    else exit the program
*/

import java.util.Scanner;
import java.lang.*;

public class SimpleTwoNumberCalculator {
    public static void main(String[] args) {

        // Declare variable for condition
        int one = 1;

        // State program description
        System.out.println("This program calculates two integers depending on the arithmetic operation you supply.");

        // Loop program
        while (one == 1) {

            // Create new input object
            Scanner input = new Scanner(System.in);

            // Declare total String variable
            String total = "none";
            double result = 0;

            // Ask user for two numbers and store
            System.out.print("Enter two numbers separated by a space: ");
            double number1 = input.nextDouble();
            double number2 = input.nextDouble();
            input.nextLine();

            // Ask user for arithmetic operation of choice
            System.out.println("Choose between addition, subtraction, multiplication, or " + "division.");
            System.out.print("Enter arithmetic operation: ");
            String operation = input.nextLine();
            System.out.println(operation);

            // Check the operation through a condition
            if (operation.equalsIgnoreCase("addition")) {
                result = number1 + number2;
                total = "sum";
            } else if (operation.equalsIgnoreCase("subtraction")) {
                result = number1 - number2;
                total = "difference";
            } else if (operation.equalsIgnoreCase("multiplication")) {
                result = number1 * number2;
                total = "product";
            } else if (operation.equalsIgnoreCase("division")) {
                result = number1 / number2;
                total = "quotient";
            }

            // Display result
            System.out.printf("The %s of %5.2f and %5.2f is %5.2f.\n", total, number1, number2, result);

            // Ask user to continue or exit

            /*
             * Prompt, store variable If continue, continue execution If exit, return 0
             */

            // Prompt, store variable
            System.out.print("Do you want to continue? [Y/N]: ");
            char continueValue = input.next().charAt(0);

            // If else for checking if the program should continue
            if (continueValue == 'N' || continueValue == 'n') {
                System.out.println("Thank you for using this program!");
                System.exit(0);
            }

            // System.out.println("Go on"); /* Checks if the the execution is correct */
        }

    }

}