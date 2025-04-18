package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class ListsSet {
    // Declare a global ArrayList to store the TODO list
    private final ArrayList<String> todoList = new ArrayList<>();

    public ListsSet()
    {
        todoList.add("Have fun");

    }
    public void manageTodoList()
    {
        // Create a scan object for user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the TODO List Application!");

        do {
            displayMenu();
            int choice = scan.nextInt();
            scan.nextLine();
            if (choice >0 && choice<5  )
            {
                switch (choice) {
                    case 1:
                        addTask(scan);
                        break;
                    case 2:
                        removeTask(scan);
                        break;
                    case 3:
                        displayTasks();
                        System.out.println("Please hit enter to continue");
                        scan.nextLine();
                        break;
                    case 4:
                        System.out.println("Thank you for using my toDo list app");
                        scan.close();
                        return;
                    default:
                        System.out.println("please make sure the number is between 1-4");


                }

            }
            else {
                System.out.println("Please enter a number");
            }

        }
        while (true);

    }

    // Method to display the menu
    private void displayMenu() {
        System.out.print("""
                TODO List Menu:
                1. Add a task
                2. Remove a task
                3. Display tasks
                4. Exit""");
    }

    // Method to add a task to the TODO list
    private void addTask(Scanner scanner) {
        String newWord = scanner.nextLine();
        todoList.add(newWord);
    }

    // Method to remove a task from the TODO list
    private void removeTask(Scanner scanner) {
        System.out.println("Please pick which task you would like to remove..");
        int removeWord = scanner.nextInt();
        removeWord -= 1;

            System.out.println("removing " + todoList.get(removeWord));
            todoList.remove(removeWord-1);


    }

    // Method to display all tasks in the TODO list
    private void displayTasks()
    {
        int j = 1;
        for (int i = 0; i< todoList.size(); i++)
        {

            System.out.println( j + ": " +todoList.get(i));
            j ++;
        }


    }
}


