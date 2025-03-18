import java.util.Random;
import java.util.Scanner;

public class WordScramble {
    public static void main(String[] args)
    {
        int pointCounter = 0;
        String userInput;
        Scanner scan = new Scanner(System.in);

            String word = getWord();
            String shuffled = shuffleWord(word);
            System.out.println(shuffled);
            //System.out.println("Please take a guess the word...");
           // String guess = scan.nextLine();
            while (!wordCompare(word,shuffled)){
                System.out.println(shuffled);
                shuffled = shuffleWord(shuffled);
                pointCounter++;
            }
            System.out.println(shuffled + pointCounter);


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
