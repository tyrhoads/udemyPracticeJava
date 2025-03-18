import java.util.Random;
import java.util.Scanner;

public class WordScramble {
    public static void main(String[] args)
    {
        int pointCounter = 0;
        String userInput;
        Scanner scan = new Scanner(System.in);
        do {
            String word = getWord();
            String shuffled = shuffleWord(word);
            System.out.println(shuffled);
            System.out.println("Please take a guess the word...");
            String guess = scan.nextLine();
            if (wordCompare(word,guess))
            {
                pointCounter++;
                System.out.println("Good work your score is now " + pointCounter);

            }
            else
            {
                System.out.println("You are not very good at this game are you. Your score is still " + pointCounter);
            }
            System.out.println("If you would like to stop playing type No or just hit enter to keep going");
            userInput = scan.nextLine();

        }
        while (!userInput.equalsIgnoreCase("No"));

        scan.close();
    }




    public static String getWord()
    {
        String[] words = {"delightful","intelligent","conquer","transform","persuade",
                          "advance","inspiration","serenity","beauty","harmony"};
        Random random = new Random();
        int index = random.nextInt(10);
        return words[index];
    }
    public static String shuffleWord(String word)
    {
        char[] wordArray = word.toCharArray();
        Random random = new Random();
        for (int i = wordArray.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            char temp = wordArray[i];
            wordArray[i] = wordArray[j];
            wordArray[j] = temp;
        }
        return new String(wordArray);
    }
    public static boolean wordCompare(String word, String guess)
    {
        return word.equalsIgnoreCase(guess);
    }
}
