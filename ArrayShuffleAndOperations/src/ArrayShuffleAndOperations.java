// Importing necessary Java package for utility functions
import java.util.Arrays;
import java.util.Random;

public class ArrayShuffleAndOperations
{
    int[] numbers = {12, 43, 56, 78, 34, 23, 89, 90, 65, 31};
    public void arrayShuffleAndOperations() {
        // Declare and initialize an array with 10 integers
        System.out.println(calculateSum(numbers));

        // Display the original array
        // Shuffle the array
        // Find and display the sum, minimum, and maximum of the array
        // Sort the array and display the sorted array
        //TODO

    }

    // Method to shuffle the array
    public void shuffleArray(int[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {

            //TODO
        }
    }

    // Method to calculate the sum of the array
    public  int calculateSum(int[] array) {
       int result = 0;
        for (int i: array){
            result += i;
        }
        return result;
    }

    // Method to find the minimum value in the array
    public int findMin(int[] array) {
        //TODO
        return 0;
    }

    // Method to find the maximum value in the array
    public int findMax(int[] array) {
        //TODO
        return 0;
    }
    public static void main(String[] args)
    {
        ArrayShuffleAndOperations obj = new ArrayShuffleAndOperations();
        obj.arrayShuffleAndOperations();

    }
}
