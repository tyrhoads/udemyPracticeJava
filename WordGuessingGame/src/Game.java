import java.util.Scanner;
import java.util.Random;

class Game
{
    protected String wordToGuess;
    protected int attempts;
    protected char[] reveledLetters;

    public Game(String wordToGuess)
        {
            this.wordToGuess = wordToGuess;
            this.attempts = 0;
            this.reveledLetters= new char[wordToGuess.length()];
            for (int i=0; i<wordToGuess.length(); i++)
            {
                reveledLetters[i] = '-';
            }
        }

    public void gamePlay()
    {
        System.out.println("Welcome To the word guessing Game:");
        System.out.println("Time to try and guess the word:");

    }

}
