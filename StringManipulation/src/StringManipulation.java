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

                // Lexicographical comparison using compareTo
                //TODO

                // Demonstrate substring and replace methods
                //TODO

                // Convert sentence to upper and lower case
                //TODO

                // Formatting with strings and numbers
                //TODO
        }
    }


