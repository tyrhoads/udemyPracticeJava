import java.util.Random;

class AdvancedGame extends InputGame
{
    Random random;


    public AdvancedGame(String wordToGuess) {
        super(wordToGuess);
        this.random = new Random();
    }
}
