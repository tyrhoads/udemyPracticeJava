// Importing necessary Java package for utility functions
import java.util.Arrays;
import java.util.Random;

public class ArrayShuffleAndOperations
{
    int[] numbers = {12, 43, 56, 78, 34, 23, 89, 90, 65, 31};
    public void arrayShuffleAndOperations() {
        // Declare and initialize an array with 10 integers

        System.out.println("The original Array is " + Arrays.toString(numbers));
        System.out.println("The sum of the array is....." + calculateSum(numbers));
        System.out.println("The minimum number in the array is...." + findMin(numbers));
        System.out.println("The maximum number in the array is...." + findMax(numbers));
        System.out.println("The shuffled Array is " + shuffleArray(numbers));
        System.out.println("The sorted Array is " + sortArray(numbers));


        // Shuffle the array
        // Sort the array and display the sorted array
        //TODO

    }

    // Method to shuffle the array
    public String shuffleArray(int[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {

            int index = random.nextInt(i + 1);
            // Swap the elements
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
        return Arrays.toString(array);
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
        int min = array[0];
        for (int i: array)
        {
            if(i<min)
            {
                min = i;
            }
        }

        return min;
    }

    // Method to find the maximum value in the array
    public int findMax(int[] array) {
        int max = array[0];
        for (int i: array)
        {
            if(i>max)
            {
                max = i;
            }
        }

        return max;
    }


    public String sortArray(int[] array)
    {

        for (int i = 0; i < array.length; i++)
        {
            for (int j = i+1; j<array.length; j++)
            {
                if(array[i] > array[j])
                {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

        }

        return Arrays.toString(array);
    }



    public static void main(String[] args)
    {
        ArrayShuffleAndOperations obj = new ArrayShuffleAndOperations();
        obj.arrayShuffleAndOperations();

    }
}
