
// Import necessary Java packages
import java.util.Random;

public class SpaceTravelPlus
{

    public static void main(String[] args)
    {
        // Declare and initialize a 2D array representing sectors in space
        String[][] spaceGrid = {
                {"Empty", "Asteroids", "Planet"},
                {"Alien Ship", "Empty", "Space Station"},
                {"Comet", "Black Hole", "Empty"}
        };

        Random random = new Random();
        System.out.println("Space Grid:");
        for (int i = 0; i<spaceGrid.length; i++)
             {
                 for (int j = 0; j <spaceGrid.length; j++)
                 {
                    System.out.print(spaceGrid[i][j] + " ");
                 }
                System.out.println(" ");
            }
        // Display the initial state of the space grid
        //TODO
        System.out.println(" ");
        System.out.println("We are ");
        // Simulate traveling through space by visiting random sectors
        //TODO

        int totalEvents = 5;
        for (int i = 0; i < totalEvents; i++) {
            int row = random.nextInt(3);
            int col = random.nextInt(3);
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
    public int countEmptySectors(String[][] grid)
    {
        return 0;
    }

    // Method to find the largest event in the space grid (lexicographically)
    public String findLargestEvent(String[][] grid)
    {
        return "sd";
    }
}
