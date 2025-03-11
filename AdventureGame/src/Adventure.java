import java.util.Scanner;


// Enum to represent different actions in the adventure game
enum Direction {
    NORTH, SOUTH, EAST, WEST, QUIT
}
public class Adventure {
    public static void startAdventure() {
        // Create a scanner object to take user input
        Scanner scan = new Scanner(System.in);
        Direction direction;

        // Introduction to the game
        System.out.println("Welcome to the Ultimate Adventure Game!");
        System.out.println("You find yourself in a dark forest. Choose a direction to explore.");
        System.out.println("North , South , East or West....or Quit to exit");
        String userInput = scan.nextLine();
        while(userInput != "QUIT"){
            System.out.println();
        }
        // Game loop: keep asking the player to choose a direction until they quit
        // Prompt the user to enter a direction
        // Use a switch statement to handle the player's choice
        // Ask again if the input is invalid
        //TODO


    }

    public static void main(String[] args) {
        Adventure.startAdventure();
    }

}











