class Employee {
    String empId;
    double salary;

    // Constructor resolving field/parameter naming clash using 'this'
    public Employee(String empId, double salary) {
        this.empId = empId;
        this.salary = salary;
    }

    // Method raiseSalary using parameter name 'salary' to resolve naming clash using 'this'
    public void raiseSalary(double salary) {
        this.salary += salary;
    }

    public void printDetails() {
        System.out.println(empId + " | Final Salary: Rs " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an array of employees with starting salaries
        Employee[] employees = {
            new Employee("E-101", 40000),
            new Employee("E-102", 55000),
            new Employee("E-103", 62000),
            new Employee("E-104", 48000)
        };

        double bonus = 5000;

        // Apply bonus in a single pass and print final salary
        for (Employee emp : employees) {
            emp.raiseSalary(bonus);
            emp.printDetails();
        }
    }
}