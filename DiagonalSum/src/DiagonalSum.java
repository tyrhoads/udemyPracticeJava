import java.util.Arrays;
import java.util.Scanner;

public class DiagonalSum
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number for the size of the matrix..");
        int matrixSize = scan.nextInt();
        scan.nextLine();
        int[][] matrix = new int[matrixSize][matrixSize];
        for (int i = 0; i<matrixSize; i++)
        {
            for (int j = 0; j<matrixSize; j++)
            {
                System.out.println("Please enter next number to fill the matrix..");
                matrix[i][j]= scan.nextInt();
                scan.nextLine();
            }
        }
        System.out.println(Arrays.deepToString(matrix));

        scan.close();
    }
}