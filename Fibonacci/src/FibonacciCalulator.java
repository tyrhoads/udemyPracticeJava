import java.util.Scanner;

public class FibonacciCalulator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number for  Fibonacci sequence");
        int userInput = scan.nextInt();
        scan.nextLine();
        double firstNumber = 0;
        double secondNumber = 1;
        if(userInput == 1)
        {
            System.out.print(firstNumber);
        }
        else if (userInput == 2)
        {
            System.out.print(firstNumber + "," + secondNumber);
        }
        else
        {
            System.out.print(firstNumber + "," + secondNumber);
            double nextNumber;

            for(int i = 0; i < userInput; i++)
            {
                nextNumber = firstNumber + secondNumber;

                System.out.print( "," + nextNumber);
                firstNumber = secondNumber;
                secondNumber = nextNumber;

            }
        }

    }
}