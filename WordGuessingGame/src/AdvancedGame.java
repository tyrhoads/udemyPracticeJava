import java.util.Random;

class AdvancedGame extends InputGame
{
    Random random;


    public AdvancedGame(String wordToGuess) {
        super(wordToGuess);
        this.random = new Random();
    }

    @Override
    public void displayHint()
    {
        //super.displayHint();
        if (attempts>0)
        {
            reveledLetters();
            System.out.println("🔍 Revealed so far: " + getRevealedWord());
        }
    }
    private void reveledLetters()
    {
        int index;
        do
        {
            index = random.nextInt(wordToGuess.length());

        }
        while (reveledLetters[index] != '*');
        reveledLetters[index] = wordToGuess.charAt(index);
    }
}
