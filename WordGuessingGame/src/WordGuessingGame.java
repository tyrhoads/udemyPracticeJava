import java.util.Random;

public class WordGuessingGame
{
    public static void main(String[] args)
    {
        String[] wordToGuess = {"Tyler","Fuck","Bitch","Butt","Boobs", "Shit"};
        Random random = new Random();
        int wordIndex = random.nextInt(wordToGuess.length);
        AdvancedGame game = new AdvancedGame(wordToGuess[wordIndex]);
        game.gamePlay();
    }
}
