import java.util.Scanner;

public class EncoderDecoderGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Display menu
        System.out.println("Welcome to the Encoder-Decoder Game!");
        System.out.println("1. Encode a string");
        System.out.println("2. Decode a string");
        System.out.print("Choose an option (1 or 2): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Step 2: Prompt user for input string
        System.out.print("Enter the string: ");
        String input = scanner.nextLine();

        if (choice == 1) {
            // Step 3: Call encode function and display result (COMPLETE THIS PART)
            String encodedString = // COMPLETE THIS PART
                    System.out.println("Encoded string: " + encodedString);
        } else if (choice == 2) {
            // Step 4: Call decode function and display result (COMPLETE THIS PART)
            String decodedString = // COMPLETE THIS PART
                    System.out.println("Decoded string: " + decodedString);
        } else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }

    // Step 5: Recursive function to encode a string using Atbash cipher
    public static String encode(String input, int index) {
        if (// COMPLETE THIS PART) {
        return "";
    }
    char ch = input.charAt(index);
    char encodedChar = atbash(ch);
            return encodedChar + encode(input, index + 1);
}

// Step 6: Recursive function to decode a string using Atbash cipher (same as encoding)
public static String decode(String input, int index) {
    return // COMPLETE THIS PART
}

// Step 7: Function to apply Atbash cipher to a character
public static char atbash(char ch) {
    if (// COMPLETE THIS PART) {
    return (char) ('z' - (ch - 'a'));
} else if (// COMPLETE THIS PART) {
        return (char) ('Z' - (ch - 'A'));
        } else {
        return ch;
            }
                    }
                    }


