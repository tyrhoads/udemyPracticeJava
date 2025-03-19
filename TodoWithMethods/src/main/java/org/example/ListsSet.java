package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class ListsSet {
    // Declare a global ArrayList to store the TODO list
    private ArrayList<String> todoList = new ArrayList<>();

    public ListsSet()
    {
        todoList.add(" ");

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
            switch (choice)
            {
                case 1:
                    addTask(scan);
                    break;
                case 2:
                    removeTask(scan);
                    break;
                case 3:
                    displayTasks();
                    break;
                case 4:
                    System.out.println("Thank you for using my toDo list app");
                    return;


            }

        }
        while (true);

        // Display the menu options
        // Consume the newline character
        // Handle the menu choice
        //TODO
    }
//TODO List Menu:
//1. Add a task
//2. Remove a task
//3. Display tasks
//4. Exit
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
        todoList.remove(removeWord);
    }

    // Method to display all tasks in the TODO list
    private void displayTasks() {
        //TODO
    }
}


