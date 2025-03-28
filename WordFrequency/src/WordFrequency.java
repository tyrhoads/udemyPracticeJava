import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequency
{
    public static void main(String[] args) {
    // Step 1: Read input from the user
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a paragraph of text:");
    String paragraph = scanner.nextLine();

    // Step 2: Normalize the text
    String normalizedText = normalizeText(paragraph);

    // Step 3: Split the text into words
    String[] words = normalizedText.split(" "); // Todo COMPLETE THIS PART

    // Step 4: Count word frequencies
    HashMap<String, Integer> wordFrequencies = new HashMap<>();
    for (String word : words) {
        if (!word.isEmpty()) {
            wordFrequencies.put(word, wordFrequencies.getOrDefault(word, 0) + 1);
        }
    }

        for (Map.Entry<String, Integer> entry : wordFrequencies.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    // Step 5: Determine the most frequent word
    String mostFrequentWord = null;
    int maxFrequency = 0;
    for (Map.Entry<String, Integer> entry : wordFrequencies.entrySet()) {
        if (entry.getValue() > maxFrequency) // todo COMPLETE THIS PART
        {
        mostFrequentWord = entry.getKey();
        maxFrequency = entry.getValue();
        }
}

    // Step 6: Output the result
        if (mostFrequentWord != null) {
    System.out.println("Most frequent word: \"" + mostFrequentWord + "\" with frequency: " + maxFrequency);
} else {
    System.out.println("No valid words found in the input.");
}

        scanner.close();
}

// Step 7: Helper method to normalize the text
private static String normalizeText(String text) {
    StringBuilder normalized = new StringBuilder();
    for (int i = 0; i < text.length(); i++) {
        char c = text.charAt(i);
        if (Character.isLetterOrDigit(c) || Character.isWhitespace(c))
        {
        normalized.append(Character.toLowerCase(c));
    }
}
        return normalized.toString();
    }
}
