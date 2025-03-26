import java.util.Scanner;

public class InputUtils
{
    Scanner scanner;

    public InputUtils(Scanner scanner)
    {
        this.scanner = new Scanner(System.in);
    }

    public double readDouble()
    {
        while (!scanner.hasNextDouble())
        {
            System.out.println("Please enter a valid number.");
            scanner.next();
        }
        double value = scanner.nextDouble();
        scanner.nextLine();
        return value;
    }
    public String readString()
    {
        return scanner.nextLine();
    }
    public int readInt()
    {
        while (!scanner.hasNextInt())
        {
            System.out.println("Please enter a valid number.");
            scanner.next();
        }
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }
    public void print(String input)
    {
        System.out.println(input);
    }
}
