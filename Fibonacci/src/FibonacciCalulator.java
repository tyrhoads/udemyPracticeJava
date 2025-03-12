import java.util.Scanner;

public class FibonacciCalulator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number for  Fibonacci sequence");
        int userInput = scan.nextInt();
        scan.nextLine();
        if(userInput == 1)
        {
            System.out.print(0);
        }

    }
}