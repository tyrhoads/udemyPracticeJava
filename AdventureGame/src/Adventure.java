import java.util.Scanner;


// Enum to represent different actions in the adventure game
enum Direction {
    NORTH, SOUTH, EAST, WEST
}
public class Adventure {
    public static void startAdventure() {
        // Create a scanner object to take user input
        Scanner scan = new Scanner(System.in);
        Direction direction;

        // Introduction to the game
        System.out.println("Welcome to the Ultimate Adventure Game!");
        System.out.println("You find yourself in a dark forest. Choose a direction to explore.");

        String userInput = "tester";
        while(!userInput.equalsIgnoreCase("QUIT"))
        {
            System.out.println("North , South , East or West....or Quit to exit");
            userInput = scan.nextLine().toUpperCase();
            try {
                direction = Direction.valueOf(userInput);
            }
            catch (Exception e)
            {
                System.out.println("Please pick a valid entry");
                continue;
            }
            switch (direction)
            {
                case NORTH:
                    System.out.println("You went North and saw a Woman bathing nude in the river");
                    System.out.println("Her Husband see you and chases you off ");
                    break;
                case SOUTH:
                    System.out.println("You find a sexy elf maiden and have a night of vigorous love making");
                    break;
                case EAST:
                    System.out.println("You fall off a cliff");
                    break;
                case WEST:
                    System.out.println("You find treasure");
                    break;

            }


        }
        // Game loop: keep asking the player to choose a direction until they quit
        // Prompt the user to enter a direction
        // Use a switch statement to handle the player's choice
        // Ask again if the input is invalid
        //TODO
    scan.close();

    }

    public static void main(String[] args) {
        Adventure.startAdventure();
    }

}











