public class EmployeeTrackerApp
{
    public static void main(String[] args)
    {
        // Create Employee objects
        Employee emp1 = new Employee("Alice", "HR");
        Employee emp2 = new Employee("Bob", "Engineering");
        Employee emp3 = new Employee("Charlie", "Finance");

        System.out.println(emp1.getDetails());
        System.out.println(emp2.getDetails());
        System.out.println(emp3.getDetails());

        System.out.print("Total Number of employees: " + Employee.getTotalEmployees());
    }
}

