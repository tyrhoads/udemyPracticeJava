import java.util.Scanner;

public class SimpleChatBot {
    public static void main(String[] args)
    {
        // Step 1: Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Step 2: Prompt the user for input
        System.out.println("Please enter something: ");
        String userInput = scanner.nextLine(); // Read user input

        // Step 3: Process user input using conditional statements
        if (userInput.equalsIgnoreCase("hello") || userInput.equalsIgnoreCase("hi"))
        {
            System.out.println("Chatbot: Hello! How can I help you today?");
        } else if ()
        {
            System.out.println("Chatbot: I'm just a bot, but I'm here to help you!");
        }
        else if ()
        {
            System.out.println("Chatbot: I don’t have real-time weather data, but it's always sunny in the digital world!");
        }
        else if ()
        {
            System.out.println("Chatbot: Goodbye! Have a great day!");
        }
        else
        {
            System.out.println("Chatbot: I'm sorry, I don't understand that.");
        }

        // Step 4: Close Scanner
        scanner.close();
        }
    }


