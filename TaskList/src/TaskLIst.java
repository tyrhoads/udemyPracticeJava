import java.util.ArrayDeque;

public class TaskLIst
{
    public static void main (String[] args)
    {
        // Create an ArrayDeque to represent a task queue
        //TODO
        ArrayDeque<String> task = new ArrayDeque<>();
        // Add tasks to the queue
        //TODO
        task.add("Processing: Task 1: Clean the house");
        task.add("Processing: Task 2: Complete Java exercise");
        task.add("Processing: Task 3: Pay utility bills");

        // Process and display each task in FIFO order
        System.out.println("Processing tasks:");
        //TODO
        while (!task.isEmpty())
            System.out.println(task.poll());
    }
}
