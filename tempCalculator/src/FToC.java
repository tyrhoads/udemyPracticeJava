import java.util.InputMismatchException;
import java.util.Scanner;

public class FToC
{
    public static void main(String[] args)
    {
        double fahrenheit = 0;
        double celsius = 0;
        int userInput = 20;
        
        Scanner scan = new Scanner(System.in);
        while (userInput != 0)
        {
            System.out.println("Menu for converter");
            System.out.println("1: Fahrenheit to Celsius");
            System.out.println("2: Celsius to Fahrenheit");
            System.out.println("0: To Exit Program");
            System.out.println(" ");
            userInput = scan.nextInt();
            switch (userInput)
            {
                case 1:
                    fahrenheit = getTemp(scan);
                    celsius = (5.0/9.0) * (fahrenheit - 32.0);
                    System.out.printf("%.2f is %.2f in celsius%n", fahrenheit, celsius);
                    break;
                case 2:
                    celsius = getTemp(scan);
                    fahrenheit = (9.0/5.0 * celsius) + 32.0;
                    System.out.println(celsius + " is " + fahrenheit + " in celsius");

                    break;
                case 0:
                    System.out.println("Thank you for using.");
                    break;
                default:
                    System.out.println("Invalid input");
            }

        }


    }

    public static double getTemp(Scanner scan) {
        double temp = 0;
        boolean valid = false;
        while (!valid) {
            System.out.println("Please enter temperature:");
            try {
                temp = scan.nextDouble();
                valid = true; // valid input received, exit loop
            } catch (InputMismatchException e) {
                System.out.println("Invalid entry. Please enter a valid number.");
                scan.next(); // clear invalid input
            }
        }
        return temp;
    }
}
