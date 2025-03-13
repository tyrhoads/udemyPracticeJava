import java.util.Scanner;

public class FibonacciCalulator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number for  Fibonacci sequence");
        int userInput = scan.nextInt();
        scan.nextLine();




            for(int i = 0; i < userInput; i++)
            {
                System.out.print(fibonacci(i) +  "," );

            }


    }

    public static int fibonacci (int n){
        if(n<=1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
