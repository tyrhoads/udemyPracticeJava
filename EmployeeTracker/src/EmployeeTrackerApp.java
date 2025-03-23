public class EmployeeTrackerApp
{
    public static void main(String[] args)
    {
        // Create Employee objects
        Employee emp1 = new Employee("Alice", "HR");
        Employee emp2 = new Employee("Bob", "Engineering");
        Employee emp3 = new Employee("Charlie", "Finance");

        System.out.print(emp1.getDetails());
        System.out.print(emp2.getDetails());
        System.out.print(emp3.getDetails());

        // Display total number of employees using a static method
        //TODO
    }
}

