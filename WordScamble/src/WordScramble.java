import java.util.Random;

public class WordScramble {
    public static void main(String[] args) {
        String something = getWord();
        System.out.println(something);

    }
    public static String getWord()
    {
        String[] words = {"delightful","intelligent","conquer","transform","persuade",
                          "advance","inspiration","serenity","beauty","harmony"};
        Random random = new Random();
        int index = random.nextInt(10);
        return words[index];
    }
}
