import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args)
    {
        int low = 1;
        int high =100;
        int mid = low + (high-low)/2;
        Scanner scan = new Scanner(System.in);
        print("Please think of a number between 1-100");
        print("when the computer guesses please type H if your guess is higher or L if its lower than the guess");
        print("finally hit C if the computer guesses correctly.");
        scan.close();

    }

    private static void print(String input)
    {
        System.out.println(input);
    }
}
