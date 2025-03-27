import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Duplicate {
    public static boolean checkingArray(int[] num, int k) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < num.length; i++) {
            if (set.contains(num[i])) {
                return true;
            }
            set.add(num[i]);

            if (set.size() > k) {
                set.remove(num[i - k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the amount of numbers you want in an array");
        int n = scan.nextInt();
        int[] num = new int[n];
        System.out.println("Enter the numbers");
        for (int i =0; i < n; i++)
        {
            num[i] = scan.nextInt();
        }

        System.out.println("Please enter a target number:");
        int k = scan.nextInt();

        boolean result = checkingArray(num,k);

        System.out.println("The result is : "+ result);

    }
}
