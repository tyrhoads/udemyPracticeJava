
// Import necessary Java packages
import java.util.Random;

public class SpaceTravelPlus
{

    public static void main(String[] args) {
        // Declare and initialize a 2D array representing sectors in space
        String[][] spaceGrid = {
                {"Empty", "Asteroids", "Planet"},
                {"Alien Ship", "Empty", "Space Station"},
                {"Comet", "Black Hole", "Empty"}
        };

        Random random = new Random();
        int randRow = random.nextInt(2);
        int randCullom = random.nextInt(2);
        // Display the initial state of the space grid
        //TODO
        System.out.println("We are ");
        // Simulate traveling through space by visiting random sectors
        //TODO

        int totalEvents = 5;
        for (int i = 0; i < totalEvents; i++) {
            // Get random row index
            // Get random column index
            //TODO

            System.out.println("Visiting sector [" + row + "][" + col + "]: " + spaceGrid[row][col]);
        }

        // Calculate the number of "Empty" sectors
        //TODO

        // Find the largest "event" (based on ASCII comparison) in the space grid
        //TODO
    }

    // Method to display the space grid
    public void displayGrid(String[][] grid) {
        //TODO
    }

    // Method to count the number of "Empty" sectors in the space grid
    public int countEmptySectors(String[][] grid) {
        //TODO
    }

    // Method to find the largest event in the space grid (lexicographically)
    public String findLargestEvent(String[][] grid) {
        //TODO
    }
}
