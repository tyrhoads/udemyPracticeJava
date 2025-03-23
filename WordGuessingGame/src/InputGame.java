import java.util.Scanner;

class InputGame extends Game
{
    Scanner scan;

    public InputGame(String wordToGuess) {
        super(wordToGuess);
        this.scan = new Scanner(System.in);
    }
}
