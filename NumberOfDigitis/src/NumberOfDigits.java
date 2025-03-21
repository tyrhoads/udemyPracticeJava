import java.util.Scanner;

public class NumberOfDigits
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please add a number to see how many digits are in it:  ");
        int input = scan.nextInt();
        scan.nextLine();
        int digitNumber = digitCounter(input);
        System.out.println("The number you asked was " + input + " and that has " + digitNumber + " digits.");

        scan.close();
    }

    public static int digitCounter(int input)
    {

        if(input<=1)
        {
            return input;
        }

        return digitCounter(input/10) +1;
    }

}
