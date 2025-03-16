
// Import necessary Java packages
import java.util.Random;

public class SpaceTravelPlus
{

    public static void main(String[] args)
    {
        // Declare and initialize a 2D array representing sectors in space
        String[][] spaceGrid = {
                {"Empty", "Asteroids", "Planet"},
                {"Alien Ship", "Zeon warrior pincses", "Space Station"},
                {"Comet", "Black Hole", "Empty"}
        };

        Random random = new Random();
        System.out.println("Space Grid:");
        displayGrid(spaceGrid);

        System.out.println(" ");
        System.out.println("We are ");
        // Simulate traveling through space by visiting random sectors

        int totalEvents = 5;
        for (int i = 0; i < totalEvents; i++) {
            int row = random.nextInt(3);
            int col = random.nextInt(3);
            //TODO

            System.out.println("Visiting sector [" + row + "][" + col + "]: " + spaceGrid[row][col]);
        }

        System.out.println("Total empty sectors: " + countEmptySectors(spaceGrid));
        System.out.println("Largest event in space grid: " + findLargestEvent(spaceGrid));


        // Calculate the number of "Empty" sectors
        //TODO

        // Find the largest "event" (based on ASCII comparison) in the space grid
        //TODO
    }

    // Method to display the space grid
    public static void displayGrid(String[][] grid) {
        for (int i = 0; i<grid.length; i++)
        {
            for (int j = 0; j <grid.length; j++)
            {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    // Method to count the number of "Empty" sectors in the space grid
    public static int countEmptySectors(String[][] grid)
    {
        int emptyTotal = 0;
        for (int i = 0; i<grid.length; i++)
        {
            for (int j = 0; j < grid.length; j++)
            {
                if(grid[i][j].equals("Empty"))
                {
                    emptyTotal++;
                }
                System.out.print(grid[i][j] + " ");
            }
        }
        return emptyTotal;
    }

    // Method to find the largest event in the space grid (lexicographically)
    public static String findLargestEvent(String[][] grid)
    {
        String largestEvent = grid[0][0];
        for (int i = 0; i<grid.length; i++)
        {
            for (int j = 0; j < grid.length; j++)
            {
                if(largestEvent.compareTo(grid[i][j]) < 0 )
                {
                    largestEvent = grid[i][j];
                }

            }
        }
        return largestEvent;
    }
}
