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
                    break;
                case 2:
                    break;
                case 0:
                    System.out.println("Thank you for using.");
                    break;
                default:
                    System.out.println("Invalid input");
            }

        }


    }

    public double getTemp(Scanner scan)
    {
        System.out.println("Please enter temperature.");
        return scan.nextDouble();
    }
}
