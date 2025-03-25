public class Employee
{

    private String name;
    private String department;
    private static int employeeNumber =0;

    // Constructor using this keyword
    public Employee(String name, String department) {
        this.name =name;
        this.department = department;
        employeeNumber++;

    }

    // Method to get employee details using this keyword
    public String getDetails()
    {
        return "Name: " + this.name + " Department: " + this.department;
    }

    // Static method to get the total number of employees
    public static int getTotalEmployees()
    {
        return employeeNumber;
    }
}
