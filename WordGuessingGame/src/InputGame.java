import java.util.Scanner;

class InputGame extends Game
{
    Scanner scan;

    public InputGame(String wordToGuess) {
        super(wordToGuess);
        this.scan = new Scanner(System.in);
    }

    @Override
    public void gamePlay()
    {
        super.gamePlay();
        super.displayHint();
        String userInput = "";
        while (!userInput.equalsIgnoreCase(wordToGuess)) {
            System.out.println("Please enter your guess for the word ");
            displayHint();
            userInput = scan.nextLine();
            attempts++;
            if (userInput.equalsIgnoreCase(wordToGuess)) {
                System.out.println("🎉 Congratulations! You've guessed the word in " + attempts + " attempts.");
                return;
            } else {
                System.out.println("❌ Incorrect guess. Try again!");
            }
            System.out.println("Revealed so far: " + getRevealedWord());
        }

    }

}
