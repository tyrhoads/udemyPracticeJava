// Importing the necessary Java package for handling user input
import java.util.Scanner;

public class StringManipulation
    {
        public static void main(String[] args)
        {
                // Create a scanner object to take user input
                Scanner scanner = new Scanner(System.in);

                // Prompt the user to enter a full sentence
                System.out.println("Enter a full sentence:");
                String sentence = scanner.nextLine();

                // Print the length of the sentence
                //TODO
                int length = sentence.length();
                System.out.println("The length of the sentence is: " + length);
                // Print the first and last character of the sentence
                //TODO
                char first = sentence.charAt(0);
                char last = sentence.charAt(length-1);
                System.out.println("The first character of the sentence is: " + first);
                System.out.println("The last character of the sentence is: " + last);

                // Ask for another string to compare
                //TODO
                System.out.println("Please enter a new sentence to compare too: ");
                String secondSentence = scanner.nextLine();


                // Compare the two sentences using equals and equalsIgnoreCase
                //TODO
                if(sentence.equals(secondSentence))
                {
                    System.out.println("The two sentences are the same.");
                }

                else if (sentence.equalsIgnoreCase(secondSentence)){
                    System.out.println("The two sentences are the same, ignoring case (equalsIgnoreCase).");
                }
                else {
                    System.out.println("The sentences do not match");
                }

                // Lexicographical comparison using compareTo
                //TODO
                int comparison = sentence.compareTo(secondSentence);
                if(comparison == 0){
                    System.out.println("The sentences are the same ");
                }
                else if (comparison>0){
                    System.out.println("The first sentence is greater than the second");
                }
                else {
                    System.out.println("The second sentence is greater");
                }
                // Demonstrate substring and replace methods
                //TODO
                System.out.println("Enter a word to replace in the first sentence,");
                String wordToReplacement = scanner.nextLine();
                System.out.println("Enter the word you want to repalce it with,");
                String replacmentWord = scanner.nextLine();
                String modifiedSentence = sentence.replace(wordToReplacement,replacmentWord);
                System.out.println(modifiedSentence);


                // Convert sentence to upper and lower case
                //TODO

                // Formatting with strings and numbers
                //TODO
            System.out.println("\nEnter an interest rate (e.g., 5.5):");
            double interestRate = scanner.nextDouble();
            System.out.printf("The formatted interest rate is: %.2f\n", interestRate);
        }
    }


