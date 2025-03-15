import java.util.Arrays;
import java.util.Scanner;

public class DiagonalSum
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = getNumber(scan);
        int[][] matrix = new int[n][n];
        fillMatrix(matrix, n, scan);
        arrayPrint(matrix,n);
        System.out.println("The sum of the first diagonal is: " + sumOfDiagonal(matrix, n));
        scan.close();

    }

    public static int getNumber(Scanner scan) {

        System.out.println("Please enter a number for the size of the matrix..");
        int matrixSize = scan.nextInt();
        scan.nextLine();


        return matrixSize;
    }

    public static void fillMatrix(int[][] array, int n, Scanner scan) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Please enter next number to fill the matrix..");
                array[i][j] = scan.nextInt();
                scan.nextLine();
            }
        }

    }

    public static int sumOfDiagonal(int[][] array, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            sum += array[i][i];
        }
        for (int i = 0; i < n; i++)
        {
            if(i != n-1-i){
              sum += array[i][n-1-i];
            }
        }


        return sum;
    }

    public static void arrayPrint(int[][] array, int n)
    {
        for (int i = 0; i<n; i++)
        {
            for (int j = 0; j < n; j++)
            {
               System.out.print(array[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}