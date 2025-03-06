// Importing the necessary Java package for handling user input
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise {
    public static void budgetTracker() {
        // Create a scanner object to take user input
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter their monthly income
        System.out.println("Enter your monthly income:");
        double income = scan.nextDouble();
        scan.nextLine();

        // Initialize variables for expenses
        ArrayList<Double> expenses = new ArrayList<Double>();

        // Prompt the user to enter the number of expenses they want to track
        // Remember to consume the newline left-over
        System.out.println("Enter the number of expenses: ");
        int numberOfExpenses = scan.nextInt();

        // Loop to track each expense
        int counter = 0;
        while (counter < numberOfExpenses)
        {
            System.out.printf("Enter expense %s:\n",counter+1);
            double expenseAmount = scan.nextDouble();
            expenses.add(expenseAmount);
            counter++;
        }

        // Calculate the remaining balance
        //TODO
        double totalExpense = 0.0;
        counter =0;
        while (counter < numberOfExpenses)
        {
            totalExpense += expenses.get(counter);
            counter ++;
        }

        // Display the total income, total expenses, and remaining balance
        System.out.printf("Total Income: $%.2f\n",income);
        System.out.printf("Total Expenses: $%.2f\n",totalExpense);
        double remainingBalance = income - totalExpense;
        System.out.printf("Remaining Balance: $%.2f\n",remainingBalance);

        // Provide a financial warning if expenses exceed income
        if(income<totalExpense)
        {
            System.out.println("Get your shit together.");
        }
    }
    public static void main(String[] args) {
        Exercise.budgetTracker();
    }
}
