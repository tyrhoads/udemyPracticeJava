import java.util.Scanner;

public class CalorieCounter
{
    public static void main(String[] args)
    {
        String food1, food2, food3;
        int calorieFood1, calorieFood2, calorieFood3, totalCaloies;

        System.out.println("Please enter food and caloric count: ");
        Scanner scan = new Scanner(System.in);
        System.out.println("First food item");
         food1 = scan.nextLine();
        System.out.println("Now enter calorie amount for " +food1);
        calorieFood1 = scan.nextInt();
        scan.nextLine();
        System.out.println("Second food item");
        food2 = scan.nextLine();
        System.out.println("Now enter calorie amount for " +food2);
        calorieFood2 = scan.nextInt();
        scan.nextLine();
        System.out.println("Third food item");
        food3 = scan.nextLine();
        System.out.println("Now enter calorie amount for " +food3);
        calorieFood3 = scan.nextInt();
        scan.nextLine();

        totalCaloies = calorieFood3 + calorieFood2 +calorieFood1;
        System.out.println("\nFoods entered are \n" + food1 + " with "+ calorieFood1 + " calories.:");
        System.out.println(food2 + " with "+ calorieFood2 + " calories.:");
        System.out.println("and " + food3 +" with "+ calorieFood3 + " calories.:");
        System.out.println("Total number of caloies for the day = " + totalCaloies);

        if (totalCaloies<2000)
        {
            System.out.println("Keep up the good work");
        }
        else
        {
            System.out.println("Lets go on a diet");
        }




        scan.close();
    }
}