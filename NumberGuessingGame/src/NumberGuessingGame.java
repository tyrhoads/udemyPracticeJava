import java.util.Scanner;

public class NumberGuessingGame
{
    public static void main(String[] args)
    {
        int low = 1;
        int high =100;
        int mid = low + (high-low)/2;
        Scanner scan = new Scanner(System.in);
        print("Please think of a number between 1-100");
        print("when the computer guesses please type H if your guess is higher or L if its lower than the guess");
        print("finally hit C if the computer guesses correctly.");
        computerGuess(scan);
        scan.close();

    }

    private static void print(String input)
    {
        System.out.println(input);
    }

    private static void computerGuess( Scanner s)
    {

        char userInput;
        while (true)
        {
            int low = 1;
            int high =100;
            int mid = low + (high-low)/2;
            print("My first guess is " + mid);
            while (low < high)
            {
                print("please enter H or L or C");
                userInput = s.next().charAt(0);
                s.nextLine();
                switch (userInput) {
                    case 'h':
                        low = mid;
                        mid = low + (high - low) / 2;
                        print("My new guess is " + mid);

                        break;
                    case 'l':
                        high = mid;
                        mid = low + (high - low) / 2;
                        print("My new guess is " + mid);


                        break;
                    case 'c':
                        print("I guest it you piece of shit. Now go fuck your mother");
                        low = high;
                        continue;
                    default:
                        print("you picked the wrong thing motherfucker");
                        break;

                }
            }
            print("You should have finished the game at this point have a good day shit head");
            print("Would you like to play again? 'Yes' or 'No' ");
            String endGame = s.nextLine();
            if(endGame.equalsIgnoreCase("no"))
            {
                print("ending game");
                break;
            }
        }
    }
}
