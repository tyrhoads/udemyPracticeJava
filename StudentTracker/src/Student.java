// Class to represent a Student
class Student {
    private double grade;
    private String name;

    // Parameterized constructor
    public Student(String name, double grade) {
        this.grade = grade;
        this.name = name;
    }

    // Method to get student details
    public String getDetails()
    {
        return "Name: " + name + ", Grade: " + grade+ "\n";
    }

    // Setters and getters (optional for this exercise)
    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }
}
