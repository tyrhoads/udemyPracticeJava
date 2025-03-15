import java.util.Arrays;
import java.util.Scanner;

public class DiagonalSum
{
    public static void main(String[] args)
    {
         Scanner scan = new Scanner(System.in);
        int n = getNumber(scan);
        int[][] matrix = new int[n][n];
        fillMatrix(matrix,n,scan);
        System.out.println(Arrays.deepToString(matrix));
        scan.close();

    }

    public static int getNumber(Scanner scan)
    {

        System.out.println("Please enter a number for the size of the matrix..");
        int matrixSize = scan.nextInt();
        scan.nextLine();


        return matrixSize;
    }
    public static void fillMatrix(int[][] array, int n, Scanner scan)
    {

        for (int i = 0; i<n; i++)
        {
            for (int j = 0; j<n; j++)
            {
                System.out.println("Please enter next number to fill the matrix..");
                array[i][j]= scan.nextInt();
                scan.nextLine();
            }
        }

    }
}