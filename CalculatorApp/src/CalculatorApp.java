import java.util.Scanner;

public class CalculatorApp
{
    public static void main(String[] args)
    {
        // Create a scanner object to take user input
        Scanner scan = new Scanner(System.in);
        String continueCalculator;

        do {
            System.out.println("Enter the first number: ");
            float firstNumber = scan.nextInt();
            scan.nextLine();
            System.out.println("Enter the second number: ");
            float secondNumber = scan.nextInt();
            scan.nextLine();
            System.out.println("Choose an operation (+, -, *, /): ");
            char operationChoice = scan.next().charAt(0);
            scan.nextLine();
            switch (operationChoice)
            {
                case '+':
                    System.out.println(firstNumber+secondNumber);
                    break;
                case '-':
                    System.out.println(firstNumber-secondNumber);
                    break;
                case '*':
                    System.out.println(firstNumber*secondNumber);
                    break;
                case '/':
                    if (secondNumber != 0) {
                        System.out.println(firstNumber / secondNumber);
                    }
                    else {
                        System.out.println("cant divideby zero");
                    }
                    break;
                default:
                    System.out.println("incorrect operation added");
                    break;
            }

            System.out.println("Do you want to perform another calculation? (yes/no):");
            continueCalculator = scan.nextLine();






        }
        while (!continueCalculator.equalsIgnoreCase("no"));


        // End the program
        System.out.println("Calculator session ended. Goodbye!");

    }
}
