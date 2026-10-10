class Employee {
    String empId;
    String empName;
    double salary;
    boolean isIntern;

    // Constructor for permanent employees (sets isIntern to false)
    public Employee(String empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.isIntern = false;
    }

    // Constructor for interns (chains to 3-arg constructor setting salary to 0, then sets isIntern to true)
    public Employee(String empId, String empName) {
        this(empId, empName, 0);
        this.isIntern = true;
    }

    // Method to print profile in the specified format
    public void printProfile() {
        System.out.println(empId + " | " + empName + " | Rs " + salary + " | Intern: " + isIntern);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create permanent employee
        Employee emp1 = new Employee("E-101", "Divya", 65000);

        // Create intern employee
        Employee emp2 = new Employee("E-102", "Arjun");

        // Print profiles
        emp1.printProfile();
        emp2.printProfile();
    }
}