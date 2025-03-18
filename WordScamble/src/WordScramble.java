import java.util.Random;

public class WordScramble {
    public static void main(String[] args) {
        String word = getWord();
        System.out.println(word);
        String shuffled = shuffleWord(word);
        System.out.println(shuffled);

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
}
