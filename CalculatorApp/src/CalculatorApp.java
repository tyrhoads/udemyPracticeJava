import java.util.Scanner;

public class CalculatorApp
{
    public static void main(String[] args)
    {
        // Create a scanner object to take user input
        Scanner scan = new Scanner(System.in);
        String continueCalculator;

        do {
            System.out.println("Do you want to perform another calculation? (yes/no):");
            continueCalculator = scan.nextLine();




            if (continueCalculator.equalsIgnoreCase("no"))
            {
                System.out.println("Calculator session ended. Goodbye!");

            }

        }
        while (!continueCalculator.equalsIgnoreCase("no"));
        // Infinite loop to keep the calculator running until the user decides to quit
        // Prompt the user to enter two numbers
        // Prompt the user to choose an operation
        // Perform the selected operation using a switch statement
        // Display the result if the operation was valid
        // Ask the user if they want to perform another calculation
        //TODO


        // End the program
        System.out.println("Calculator session ended. Goodbye!");

    }
}
